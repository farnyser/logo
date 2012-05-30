package utilities;

import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

import org.antlr.runtime.RecognitionException;

import logoparsing.LogoTree;


public class Context {
	protected Vector< HashMap<String, Double> > variables;
	protected HashMap<String, Function> functions;
	protected Stack<Integer> marks;
	protected Stack<String> calledFunction;
	protected Vector<Integer> loop;
	protected String currentFunction;
	protected double returnValue;
	private boolean interrupted = false;
	
	public Context() 
	{
		calledFunction = new Stack<String>();
		variables = new Vector< HashMap<String, Double> >();
		functions = new HashMap<String, Function>();
		loop = new Vector<Integer>();
		marks = new Stack<Integer>();
		newScope();
	}
	
	public void newScope() 
	{
		interrupted = false;
		variables.add( new HashMap<String, Double>() ); 
		loop.add(new Integer(-1));
	}	
	
	public void removeScope() 
	{ 
		if ( variables.size() > 0 )
			variables.remove( variables.size() - 1 ); 
		if ( loop.size() > 0 )
			loop.remove( loop.size() - 1 ); 
	}
	
	// divers --
	
	public int getLoop() throws Exception
	{
		for ( int i = loop.size() - 1 ; i >= 0 ; i-- )
		{
			if ( loop.elementAt(i) >= 0 )
				return loop.elementAt(i);
		}
		
		throw new Exception("LOOP inutilisable");
	}
	
	public void incLoop() 
	{
		loop.set(loop.size() - 1, (loop.elementAt(loop.size() - 1) + 1));
	}
	
	// variables --
	
	public void set(String name, double value)
	{
		System.out.println("Context set " + name + " (scope:"+0+") to " + value);
		// variables.get(getScope(name)).put(name, new Double(value));
		variables.get(0).put(name, new Double(value));

	}
	
	public void setParam(String name, double value)
	{
		System.out.println("Context setParam " + name + " (scope:"+(variables.size()-1)+") to " + value);
		variables.get(variables.size() - 1).put(name, new Double(value));
	}
	

	public void setLocal(String name, double value) throws Exception
	{
		// check fct parameters
		if ( currentFunction != null )
		{
			if ( functions.get(currentFunction).getParameters().contains(name) )
			{
				throw new Exception("Variable locale ne peut prendre le nom d'un parametre");
			}
		}
		
		System.out.println("Context setLocal " + name + " (scope:"+(variables.size()-1)+") to " + value);
		variables.get(variables.size() - 1).put(name, new Double(value));
	}
	
	public double get(String name) throws Exception
	{
		for ( int i = variables.size() - 1 ; i >= 0 ; i-- )
		{
			if ( variables.get(i).containsKey(name) )
				return variables.get(i).get(name);
		}
		 
		throw new Exception("Variable non definie");
	}	
	
	public int getScope(String name)
	{
		for ( int i = variables.size() - 1 ; i >= 0 ; i-- )
		{
			if ( variables.get(i).containsKey(name) )
				return i;
		}
		 
		return variables.size() - 1;
	}
	
	// fonctions --

	public void call(LogoTree tree, Integer after_call_mark, String name, Vector<Double> values)
	{
		System.out.println("Context call function " + name + ".");
		
		marks.push(after_call_mark);
		calledFunction.push(name);
		
		tree.push(functions.get(name).getMark());
		try {
			newScope();
			for ( int i = 0 ; i < functions.get(name).getParameters().size() ; i++ )
				setParam(functions.get(name).getParameters().elementAt(i), values.elementAt(i));
			tree.bloc();
			removeScope();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		tree.pop();
		if ( marks.size() > 0 ) { marks.pop(); }
		if ( calledFunction.size() > 0 ) { calledFunction.pop(); }
	}
	
	public void define(String name, Vector<String> params)
	{
		String pm = ""; for ( int i = 0 ; i < params.size() ; i++ ) { pm += params.elementAt(i) + ", "; } if ( pm.length() > 2 ) pm = pm.substring(0, pm.length()-2);
		System.out.println("Context define " + name + " with parameters : " + pm);
		functions.put(name, new Function(params));
	}
	
	public void setFunctionScope(String name)
	{
		this.currentFunction = name;
	}
	
	public void exitFunctionScope()
	{
		this.currentFunction = null;
	}
	
	public void setFunctionMark(String name, int m, LogoTree tree)
	{
		functions.get(name).setMark(m);
		functions.get(name).setTree(tree);
	}
	
	public boolean callable(String name)
	{
		return functions.containsKey(name);
	}
	
	public Vector<String> getParameters(String name)
	{
		return functions.containsKey(name) ? functions.get(name).getParameters() : new Vector<String>();
	}
	
	public boolean interrupted() 
	{
		return interrupted ;
	}
		
	public void returnValue(double d)
	{
		System.out.println("Context return " + d);
		returnValue = d;
		interrupted = true;
		
		if ( marks.size() > 0 )
		{
			System.out.println("rewind from " + this.calledFunction.peek());
			this.functions.get(this.calledFunction.peek()).getTree().rewind( marks.peek() );
		}
	}

	public double getReturnValue()
	{
		return returnValue;
	}
	
	public void rewind()
	{
		if ( marks.size() > 0 )
		{
			System.out.println("rewind from " + this.calledFunction.peek());
			this.functions.get(this.calledFunction.peek()).getTree().rewind( marks.peek() );
		}	
	}
}
