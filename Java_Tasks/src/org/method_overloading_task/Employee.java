package org.method_overloading_task;

public class Employee {
	
	
	public void quality_Analyst( int id)
	
	{
		System.out.println(id);
	}
	
	public void quality_Analyst ( String name)
	
	{
		System.out.println(name);
		
	}
	
	public void quality_Analyst(String s, int id)
	
	{
		System.out.println(s + " - " + id);
		
	}
	
	public static void main (String [] args)
	
	{
		Employee e1 = new Employee();
		
		e1.quality_Analyst(687);
		e1.quality_Analyst(" Victor ");
		e1.quality_Analyst("QA Engineer", 5);
	}

}
