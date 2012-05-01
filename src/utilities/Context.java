package utilities;

import java.util.HashMap;
import java.util.Vector;

import org.antlr.runtime.RecognitionException;

import logoparsing.LogoTree;


public class Context {
	protected Vector< HashMap<String, Double> > variables;
	protected HashMap<String, Function> functions;
	
	public Context() 
	{
		variables = new Vector< HashMap<String, Double> >();
		functions = new HashMap<String, Function>();
		newScope();
	}
	
	public void newScope() 
	{ 
		variables.add( new HashMap<String, Double>() ); 
	}	
	
	public void removeScope() 
	{ 
		if ( variables.size() > 0 )
			variables.remove( variables.size() - 1 ); 
	}
	
	// variables --
	
	public void set(String name, double value)
	{
		System.out.println("Context set " + name + " (scope:"+(getScope(name))+") to " + value);
		variables.get(getScope(name)).put(name, new Double(value));
	}
	
	public void setLocal(String name, double value)
	{
		System.out.println("Context set " + name + " (scope:"+(variables.size()-1)+") to " + value);
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

	public void call(LogoTree tree, String name, Vector<Double> values)
	{
		System.out.println("Context call function " + name + ".");
		
		tree.push(functions.get(name).getMark());
		try {
			newScope();
			for ( int i = 0 ; i < functions.get(name).getParameters().size() ; i++ )
				set(functions.get(name).getParameters().elementAt(i), values.elementAt(i));
			tree.bloc();
			removeScope();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		tree.pop();
	}
	
	public void define(String name, Vector<String> params)
	{
		String pm = ""; for ( int i = 0 ; i < params.size() ; i++ ) { pm += params.elementAt(i) + ", "; } if ( pm.length() > 2 ) pm = pm.substring(0, pm.length()-2);
		System.out.println("Context define " + name + " with parameters : " + pm);
		functions.put(name, new Function(params));
	}
	
	public void setFunctionMark(String name, int m)
	{
		functions.get(name).setMark(m);
	}
	
	public boolean callable(String name)
	{
		return functions.containsKey(name);
	}
	
	public Vector<String> getParameters(String name)
	{
		return functions.containsKey(name) ? functions.get(name).getParameters() : new Vector<String>();
	}
	
	public void returnValue(double d)
	{
		System.out.println("Context return " + d);
	}
}
