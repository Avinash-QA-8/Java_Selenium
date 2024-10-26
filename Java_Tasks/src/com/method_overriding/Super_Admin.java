package com.method_overriding;

public class Super_Admin {

	public void agency_User_1()
	
	{
		System.out.println(" Green Land Techonologies ");
	}
	
	
public void agency_User_2()
	
	{
		System.out.println(" Micro Computers & co ");
	}


public void agency_User_3()

{
	System.out.println(" Teacher's requirement Association ");
}
	

public static void main (String [] args)

{
	Super_Admin s = new Super_Admin();
	
	s.agency_User_1();
	s.agency_User_2();
	s.agency_User_3();
	
}



	
}
