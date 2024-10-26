package org.string_functions_or_Manupulation;

public class String_Functions_or_Manipulation {
	
	
	public static void main (String [] args)
	
	{
		
		System.out.println();
		
		String s = "Production Feature Launch";
		
		System.out.println(s);
		
		System.out.println();
		
		int length = s.length();
		System.out.println("The length of the String is :"+length);
		
		System.out.println();
		
		boolean equals = s.equals("Production Feature Launch");
		System.out.println("The given String is true or false : "+equals);
		
		
		System.out.println();
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("proDUCTION feATURE lAUNch");
		System.out.println("Equals Igonre case: "+equalsIgnoreCase);
		
		
		System.out.println();
		
		String upperCase = s.toUpperCase();
		System.out.println("The String in Upper Case : "+upperCase);
		 
		
		System.out.println();
		
		String lowerCase = s.toLowerCase();
		System.out.println("The String in Lower case:  "+lowerCase);
		
		System.out.println();
		
		boolean startsWith = s.startsWith(s);
		System.out.println(startsWith);
		
		System.out.println();
		
		boolean startsWith2 = s.startsWith(s);
		System.out.println(startsWith2);
		
		System.out.println();
		
		
		boolean endsWith = s.endsWith(s);
		System.out.println(endsWith);
		
		System.out.println();
		
		boolean contains = s.contains("Feature");
		System.out.println(contains);
		
		System.out.println();
		
		int indexOf = s.indexOf("L");
		System.out.println(indexOf);
		
		System.out.println();
		
		int lastIndexOf = s.lastIndexOf("h");
		System.out.println(lastIndexOf);
		
		
		System.out.println();
		
		char charAt = s.charAt(4);
		System.out.println(charAt);
		
		System.out.println();
		
		String replace = s.replace('a', 't');
		System.out.println(replace);
		
		System.out.println();
		
		String substring = s.substring(3,17);
		System.out.println(substring);
		
		System.out.println();
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		System.out.println();
		
		String[] split = s.split(" ");
		
//		for (int i = 0; i < split.length; i++ )
//			
//		{
//			System.out.println(split[i]);
//		}
		
		for (String x : split)
			
		{
			System.out.println(x);
		}
		
		
		
	}

} 
