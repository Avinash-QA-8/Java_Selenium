package com.scanner_concept;

import java.util.Scanner;

public class Employee_details {

	public static void main (String [] args)
	
	{
	
	    Scanner s = new Scanner (System.in);
	
	
		System.out.println(" Enter the Name of the Employee: ");
		
		String name = s.next();
		
		System.out.println(" The name is:  " +name);
		
		
		System.out.println(" Employee Desgination : ");
		
		String emp_desgination = s.nextLine();
		
		System.out.println(" The Desgination is:  " +emp_desgination);
		
		
		System.out.println(" Enter the Id of the Employee: ");
		
		int id = s.nextInt();
		
		System.out.println(" The id is: " +id);
		
		
		System.out.println(" Enter the salary:  ");
		
		float salary = s.nextFloat();
		
		System.out.println(" The salary is:  "+salary);
		
		
	    
				
	
}
	
}
