package org.Min_Max_number;

public class Min_Max_Task {
	
	public static void main (String [] args)
	
	{
		int a [] = { 56, 34,78,23,90,59,12 };

	
		int max = a[0];
		int max1 = a[0];
		
		for ( int i = 1; i < a.length; i++)
			
		{
			
			if (a[i] > max)
				
			{
				max = a[i];
				max1 = a[i];
				
			}
			
		}
		
		System.out.println(" the largest number is: " +max);
		
		System.out.println(" the second largest number is :  "+max1);
		
		
	}

}
