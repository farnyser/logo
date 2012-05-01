package utilities;

import java.util.HashMap;


public class Context {
	protected HashMap<String, Double> variables;
	
	public Context() 
	{
		variables = new HashMap<String, Double>();
	}
	
	public void set(String name, Double value)
	{
		System.out.println("Context set " + name + " to " + value);
		variables.put(name, value);
	}
	
	public double get(String name) throws Exception
	{
		if ( variables.containsKey(name) )
			return variables.get(name);
		else 
			throw new Exception("Variable non definie");
	}
}
