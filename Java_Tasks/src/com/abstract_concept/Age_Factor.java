package com.abstract_concept;

public class Age_Factor extends Marathon


{
	
	
	@Override
	public void priority_2()
	
	{
		System.out.println( " Middle Age " );
		System.out.println();
	}
	
	@Override
	public void priority_3()
	
	{
		
		System.out.println(" Younger Age ");
		System.out.println();
	}
	
	@Override
	public void priority_4()
	
	{
		System.out.println(" ladies ");
		System.out.println();
		
	}
	
	public static void main (String [] args)
	
	{
		Age_Factor a = new Age_Factor();
		
		a.priority_1();
		a.priority_2();
		a.priority_3();
		a.priority_4();
		

	}

}
