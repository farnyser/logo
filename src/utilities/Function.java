package utilities;

import java.util.Vector;

import logoparsing.LogoTree;

public class Function {
	private int mark;
	private Vector<String> parameters;
	private LogoTree tree; 
	
	public Function(Vector<String> pm) 
	{
		parameters = pm ;
	}
	
	public LogoTree getTree() 
	{
		return tree;
	}
	
	public void setTree(LogoTree tree)
	{
		this.tree = tree;
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
