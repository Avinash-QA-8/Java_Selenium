package org.swapping;

import java.util.Scanner;

public class Practice_Session {
	
	public static void main (String [] args)
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the first number : ");
		
		int num_1 = sc.nextInt();
		
		System.out.println(" Enter the second number : ");
		
		int num_2 = sc.nextInt();
		
		System.out.println(" Enter the third number : ");
		
		int num_3 = sc.nextInt();
		
		int temp = num_1;
		
		num_1 = num_2;
		
		num_2 = num_3;
		
		num_3 = temp;
		
		System.out.println(" The first swapped number : "+num_1);
		
		System.out.println(" The Second swapped number : "+num_2);
		
		System.out.println(" The Second swapped number : "+num_3);
	
		

}
	
}

