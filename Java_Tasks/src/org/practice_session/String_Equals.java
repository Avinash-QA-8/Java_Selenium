package org.practice_session;

public class String_Equals {
	
	public static void main (String [] args)
	
	{
		
		String str = " The Email address is : Testmail@yopmail.com";
		
		String str1 = " Salomia SONG from the movie JODI ";
		
		boolean equals = str.equals(" The Email Address is : Testmail@yopmail.com ");
		System.out.println(equals);
		
		System.out.println();
		
		
		boolean equalsIgnoreCase = str.equalsIgnoreCase(" The emAIl ADDRESS is : TESTMAIL@YOPMAIL.COM ");
		System.out.println(equalsIgnoreCase);
		
		System.out.println();
		
		String lowerCase = str1.toLowerCase();
		System.out.println(lowerCase);
		
		System.out.println();
		
		
		String upperCase = str1.toUpperCase();
		System.out.println(upperCase);
		
		System.out.println();
		
		boolean startsWith = str1.startsWith(str);
		System.out.println(startsWith);
		
		System.out.println();
		
		boolean endsWith = str1.endsWith(str1);
		System.out.println(endsWith);
		
		System.out.println();
		
		boolean contains = str.contains("The Email address is : Testmail@yopmail.com");
		System.out.println(contains);
		
		System.out.println();
		
		int indexOf = str.indexOf("E");
		System.out.println(indexOf);
		
		System.out.println();
		
		int lastIndexOf = str.lastIndexOf("t");
		System.out.println(lastIndexOf);
		
		System.out.println();
		
        char charAt = str.charAt(6);
        System.out.println(charAt);
        
        System.out.println();
        
        String replace2 = str.replace('a', 'q');
        System.out.println(replace2);
        
        System.out.println();
        
        String replace = str.replace("Email", "address");
        System.out.println(replace);
        
        System.out.println();
        
        String substring = str.substring(13);
        System.out.println(substring);
        
        System.out.println();
        
        CharSequence subSequence = str.subSequence(3, 13);
        System.out.println(subSequence);
        
        
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
