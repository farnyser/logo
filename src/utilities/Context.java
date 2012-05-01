package utilities;

import java.util.HashMap;
import java.util.Vector;


public class Context {
	protected Vector< HashMap<String, Double> > variables;
	
	public Context() 
	{
		variables = new Vector< HashMap<String, Double> >();
		newScope();
	}
		
	public void set(String name, double value)
	{
//		System.out.println("Context set " + name + " (scope:"+(variables.size()-1)+") to " + value);
//		variables.get(variables.size() - 1).put(name, new Double(value));

		System.out.println("Context set " + name + " (scope:"+(getScope(name))+") to " + value);
		variables.get(getScope(name)).put(name, new Double(value));
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
	
	public void newScope() 
	{ 
		variables.add( new HashMap<String, Double>() ); 
	}	
	
	public void removeScope() 
	{ 
		if ( variables.size() > 0 )
			variables.remove( variables.size() - 1 ); 
	}
}
