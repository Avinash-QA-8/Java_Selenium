package com.palindrome_practice;

import java.util.Scanner;

public class Palindrome_String {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
	
		
		
		System.out.println(" Enter the String : ");
		
		String original_Name = sc.nextLine();
		
		
		String reverse_Name = new StringBuilder(original_Name).reverse().toString();
		
		if(original_Name.equals(reverse_Name))
			
		{
			System.out.println(" the string is palindrome ");
		}
		
		else
			
		{
			
			System.out.println(" the string is not a palindrome ");
		}
		
		
	}

}
