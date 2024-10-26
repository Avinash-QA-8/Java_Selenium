package com.constructor_task;

public class Daily_Scrum_Meeting {
	
	
	
	public Daily_Scrum_Meeting()
	
	{
		
		System.out.println(" Update regarding the client projects ");
		
		System.out.println();
		
	}   // non - parameterized constructor
	
   	
	public Daily_Scrum_Meeting(int a, String meet)
	
	{
		System.out.println(" Meeting Time duration in hrs: " +a );
		
		System.out.println();
		
		System.out.println(" The name of the meet: " +meet);
		
	} // parameterized constructor. 
	
	
	public static void main (String [] args)
	
	{
		Daily_Scrum_Meeting d = new Daily_Scrum_Meeting();
		
		Daily_Scrum_Meeting d1 = new Daily_Scrum_Meeting(5,"client meeting");
	}

}
