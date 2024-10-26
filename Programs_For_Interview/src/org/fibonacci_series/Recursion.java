package org.fibonacci_series;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number : ");
		
		int terms = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		
		for(int i =1; i<=terms; i++)
			
		{
			System.out.println(fibonacci(i) + " ");
		}
		
		
	}
	
	public static int fibonacci (int n)
	
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		
		else
		{
			return fibonacci(n -1) + (n -2);
		}
	}
}
