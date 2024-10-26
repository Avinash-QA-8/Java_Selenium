package com.split_concept;

public class Split_Concept {
	
	public static void main (String [] args)
	
	{
		
		String s = " Amusement Park - Wonder Land ";
		
		System.out.println(s);
		
		String[] split = s.split(" ");
		
		for( int i = 0; i< split.length; i++)
			
		{
			System.out.println(split[i]);
		}
		
	}

}
