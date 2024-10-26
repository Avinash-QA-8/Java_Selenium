package com.method_overriding;

public class Agency_Admin extends Super_Admin{

	@Override
	public void agency_User_1()
	
	{
		super.agency_User_1();
		System.out.println(" Agency user of Green Land ");
	}
	
	
	@Override
    public void agency_User_2()
	
	{
		
		super.agency_User_2();
		System.out.println(" Manager of Micro computers & co ");
	}

	@Override
    public void agency_User_3()


    {
    
    super.agency_User_3();
	System.out.println(" Science and Maths Teachers ");

    }


    public static void main (String [] args)

{
	Agency_Admin a = new Agency_Admin();
	
	a.agency_User_1();
	a.agency_User_2();
	a.agency_User_3();
	
	
}

}
