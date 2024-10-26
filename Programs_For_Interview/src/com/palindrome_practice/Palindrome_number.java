package com.palindrome_practice;

import java.util.Scanner;

public class Palindrome_number {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number : ");
		
		int number = sc.nextInt();
		
		int original_number = number;
		
		int reverse_number = 0;
		
		
		while(number != 0)
			
		{
		
		
		int digit = number % 10;
		
		reverse_number = reverse_number * 10 + digit;
		
		number =  number / 10;
		
		}
		
		if(original_number == reverse_number)
			
		{
			System.out.println(" the number is palindrome ");
		}
		
		else
			
		{
			System.out.println(" the number is not palindrome ");
		}
		
		
		
	}

}
