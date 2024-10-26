package org.immutable;

public class Immutable_Concept {
	
	
	public static void main (String [] args)
	
	{
		
	      String s1 = "Ameerpet";
	      
	      String s2 = "kondapur";
	      
	      String s3 = "Ameerpet";
	      
	      String s4 = "Gachibowli";
	      
	      String s5 = "Charminar";
	      
	      
	      System.out.println(s1);
	      
	      System.out.println(s2);
	      
	      System.out.println(s3);
	      
	      System.out.println(s4);
	      
	      System.out.println(s5);
	      
	      
	     System.out.println();
	      
	      
	      System.out.println(System.identityHashCode(s1));
	      
	      System.out.println(System.identityHashCode(s2));
	      
	      System.out.println(System.identityHashCode(s3));
	      
	      System.out.println(System.identityHashCode(s4));
	      
	      System.out.println(System.identityHashCode(s5));
	      
	      
	      
	      String concat = s1.concat(s3);
	      
	      System.out.println();
	      
	      System.out.println(concat);
	      
	      System.out.println(System.identityHashCode(concat));
	      
	      
	      
		
		
	}

}
