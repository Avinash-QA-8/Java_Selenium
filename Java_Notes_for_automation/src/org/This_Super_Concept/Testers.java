package org.This_Super_Concept;

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
	
	public static void main (String [] args)
	
	{
		Testers t = new Testers();
		
		t.sprint_1();
	}
	
	

}
