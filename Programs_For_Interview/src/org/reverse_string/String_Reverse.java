package org.reverse_string;

public class String_Reverse {
	
	public static void main(String[] args) {
		
		
		String a = "Thalapathy";
		
		String reversed_String = "";
		
		for( int i = a.length() - 1; i>=0; i--)
			
		{
			reversed_String = reversed_String + a.charAt(i);			
		}
		
		System.out.println(" The reversed String is: "+reversed_String);
		
		
	}

}
