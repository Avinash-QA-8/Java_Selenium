package com.exceptions;

import java.util.Scanner;

public class Input_Mismatch_Exception {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
            
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt(); 
            
            System.out.println("You entered: " + num);
            
         
            
            System.out.println("Input Mismatch Exception caught!");
            
        
   
}
	
	}
	




