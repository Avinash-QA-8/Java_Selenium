package org.single_inheritance;

public class Business_Analyst {
	
	public void meetings()
	
	{
		System.out.println(" Daily Scrum call ");
	}
	
public void task_Update()
	
	{
		System.out.println(" Update the task in the Excel sheet ");
	}

public void client_Calls()

{
	System.out.println(" Get ready for the Production Launch ");
}

public static void main (String [] args)

{
	Business_Analyst b = new Business_Analyst();
	
	b.meetings();
	b.task_Update();
	b.client_Calls();
}
	
	

}
 