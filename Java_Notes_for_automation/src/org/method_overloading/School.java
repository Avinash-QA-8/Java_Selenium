package org.method_overloading;

public class School {
	
	public void student (int id)
	
	{
		System.out.println(id);
		
	}
	
	public void student (String name)
	
	{
		System.out.println(name);
	}
	
	
	public void student (char i, String n,int id)
	
	{
		System.out.println(i+ "." +n+ "-" + id);
	}
	
	
	public static void main (String [] args)
	
	{
		School s = new School();
		
		s.student(111);
		s.student(" Avinash ");
		s.student('B', "Avinash", 10  );
	}

}
