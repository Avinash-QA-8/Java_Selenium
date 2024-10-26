package org.hierarchical_inheritance_task;

public class chef_2 extends Cooking_ingredients{
	
public void menu_1()
	
	{
		System.out.println(" pasta ");
	}
	
     void menu_2()
	
	{
		System.out.println(" pizza ");
	}

public void menu_3()

{
	System.out.println(" Ramen ");
}


public static void main (String [] args)

{
	chef_2 che = new chef_2();
	

	che.menu_1();
	che.menu_2();
	che.menu_3();
	
	
	System.out.println();
	
	che.onion();
	
	
}

}
