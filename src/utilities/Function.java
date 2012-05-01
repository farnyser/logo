package utilities;

import java.util.Vector;

public class Function {
	private int mark;
	private Vector<String> parameters;
	
	public Function(Vector<String> pm) 
	{
		parameters = pm ;
	}
	
	public void setMark(int x) 
	{ 
		mark = x; 
	}
	
	public Vector<String> getParameters()
	{
		return parameters;
	}
	
	public int getMark() 
	{
		return mark;
	}
}
