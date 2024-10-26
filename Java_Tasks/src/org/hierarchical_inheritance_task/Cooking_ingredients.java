package org.hierarchical_inheritance_task;

public class Cooking_ingredients {
	
	protected void onion() // used protected access specifiers
	
	{
		System.out.println(" 2kgs ");
	}
	
     void tomato()
	
	{
		System.out.println(" 3kgs ");
	}

    public void corrindor_Powder()

{
	System.out.println(" 50gms ");
}


public static void main (String [] args)

{
	Cooking_ingredients c = new Cooking_ingredients();
	
	c.onion();
	c.tomato();
	c.corrindor_Powder();
}

}
