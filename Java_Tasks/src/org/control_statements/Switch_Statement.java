package org.control_statements;

public class Switch_Statement {
	
	
	public static void main (String [] args)
	
	{
		
		String product = "rice flour";
		
		float product_price = 78.45f;
		float tax = 2.34f;
		// float discount = 23.45f;
		
		
		
		switch (product)
		
		{
		
		case "wheat flour":
			
			System.out.println(" The product price is:  "+product_price + tax);
			break;
			
		case "rice flour":
			
			System.out.println(product_price - tax);
			break;
			
		default:
			
		{
			
			System.out.println(" Product Not For Sale !!!! ");
		}
			
			
		
		
		}
		
	}

}
