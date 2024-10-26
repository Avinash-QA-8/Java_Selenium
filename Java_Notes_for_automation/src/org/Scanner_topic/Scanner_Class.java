package org.Scanner_topic;

import java.util.Scanner;

public class Scanner_Class {
	
	public static void main (String [] args)
	
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Enter the name : ");
		String name = s.nextLine();
		System.out.println(" Full Name: " + name);
		
		System.out.println(" Enter id:  ");
		int id = s.nextInt();
		System.out.println(" The id is:  " +id  );
		
		System.out.println(" Enter your official name:  ");
		String nick = s.next();
		System.out.println(" The offical name is:  " +nick );
		
		System.out.println(" Enter the float value:  ");
	    float f_value = s.nextFloat();
	    System.out.println(" The float value is:  " +f_value );
		
		
	}

}
