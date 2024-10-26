package com.immutable;

public class String_Buffer {
	
	
	public static void main (String [] args )
	
	{
		
		StringBuffer s1 = new StringBuffer("Telangana");
		
		StringBuffer s2 = new StringBuffer("Seema Andhra");
		
		StringBuffer s3 = new StringBuffer("Tamil Nadu");
		
		StringBuffer s4 = new StringBuffer("Telangana");
		
		System.out.println();
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println(s3);
		
		System.out.println(s4);
		
		System.out.println();
		
		
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(System.identityHashCode(s4));
		
		System.out.println();
		
		
		StringBuffer append = s1.append(s4);
		System.out.println(append);
		
		System.out.println();
		
		System.out.println(System.identityHashCode(append));
		
		
		
		
		
	}

}
