package org.hierarchical_inheritance_task;

public class Chef_1 extends Cooking_ingredients {
	
          void dish_1() // default
	
	{
		System.out.println(" Curry Masala ");
	}
	
public void dish_2()
	
	{
		System.out.println(" Variety rice ");
	}

public void dish_3()

{
	System.out.println(" side dishes ");
}


 public static void main (String [] args)
 
 {
       
	 Chef_1 ch = new Chef_1();
	 ch.onion();
	 ch.tomato();
	 ch.corrindor_Powder();
	  
	 
	 
	 System.out.println("");
	
	 ch.dish_1();
	 ch.dish_2();
	 ch.dish_3();
	 
 }

}
