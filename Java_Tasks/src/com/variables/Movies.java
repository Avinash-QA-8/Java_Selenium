package com.variables;

public class Movies {
	
	String name; // class variable 
	
	int t;  // class variable
	
	float y; // class variable

	
	public void action_Thriller()
	
	{
		String name = " Okkadu ";
		
		System.out.println("The name of the film is: " +name);
		
	}  // local variable 
	
	
	public void num_of_movie()
	
	{
		int b = 3;
		
		System.out.println("The number is: "+b);
	} 
	
	// local variable 
	 
	public void run_Time()
	
	{
		float f = 2.56f;
		
		System.out.println(" The run time is:  " +f);
	}
	
	// local variable 
	
	
	public static void rating() {
		
		// int u = 5;
		
		// System.out.println("The rating is : " +u);
	}
	
	public static void main (String [] args)
	
	{
		
	    Movies m = new Movies();
		
		m.action_Thriller();
		
		System.out.println();
		
		System.out.println(" The result is : "+m.name); // object.class variable 
		
		System.out.println();
		
		m.num_of_movie();
		
		System.out.println();
		
		System.out.println(" The result is : "+m.t); // object.class variable 
		
		System.out.println();
		
		m.run_Time();
		
		System.out.println();
		
		System.out.println("The result is : "+m.y); // object.class variable 
		
	}
}
