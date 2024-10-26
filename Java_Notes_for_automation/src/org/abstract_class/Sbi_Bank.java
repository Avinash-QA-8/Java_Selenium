package org.abstract_class;

public class Sbi_Bank extends Bank  {

	@Override
	public void bike_Loan()

	{
		
		System.out.println(" 10% ");
		
		
	}
	
	public static void main (String [] args)
	
	{
		Sbi_Bank s = new Sbi_Bank();
		
		s.bike_Loan();
		s.car_Loan();
	}
	
	

}
