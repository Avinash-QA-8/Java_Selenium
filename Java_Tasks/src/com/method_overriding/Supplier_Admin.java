package com.method_overriding;

public class Supplier_Admin extends Agency_Admin {
	
   @Override
   public void agency_User_1()
	
	{   
	    super.agency_User_1();
		System.out.println(" Supplier user of Green Land Techonologies ");
		System.out.println();
	}
   
   
  @Override
   public void agency_User_2()

{   
	super.agency_User_2();  
	System.out.println(" Supplier of Micro computers & co ");
	System.out.println();
}

  @Override
   public void agency_User_3()

{
	super.agency_User_3();
	System.out.println(" Supplier of Science and Maths books ");
	System.out.println();
}

   
   public static void main (String [] args)
   
   {
	   
	   Supplier_Admin s1 = new Supplier_Admin();
	   
	   s1.agency_User_1();
	   s1.agency_User_2();
	   s1.agency_User_3();
	   
   }
	

}
