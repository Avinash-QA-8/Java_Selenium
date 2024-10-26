package org.This_Super_Task;

public class Testers extends Developers {
	
	int a = 8;
	
	String name_8 = "Avinash";
	
	
	
	public void sprint_1()
	
	{
		int data = 45;
		
		System.out.println(data);
		
		System.out.println(this.a);
		System.out.println(super.name);
	
	}
	
	public static void sprint_2()

	{
		
		String name_1 = " Client meeting ";
		
		System.out.println( "The next schedule is: "+ name_1 );
		
		// System.out.println(this.a); in static we cannot use
		// this or super 
		
	}
	
	
	public static void main (String [] args)
	
	{
		Testers t = new Testers();
		
		t.sprint_1();
		
		sprint_2();
	}
	
	

}
