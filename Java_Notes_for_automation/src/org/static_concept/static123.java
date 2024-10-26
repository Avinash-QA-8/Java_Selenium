package org.static_concept;

public class static123 {
	
	static int b = 20; // class variable (or) Instance variable.
	
	public static void sample()
	
	{
		int a = 10;  // local variable 
		
		System.out.println(a);
		System.out.println(a);

}
	
	static 
	
	{
		System.out.println(" hello world ");
	}
	
	// static block
	
	
	public static void main (String [] args)
	
	{
		sample();
		
		System.out.println(b);
	}

}