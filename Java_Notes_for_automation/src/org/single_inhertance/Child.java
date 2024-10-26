package org.single_inhertance;

public class Child extends Parent{
	
	public void film ()
	
	{
		System.out.println(" Princess ");
	}
	
	public static void main (String [] args)
	
	{
		Child c = new Child();
		
		c.property();
		c.film();
	}
	
	
	

}
