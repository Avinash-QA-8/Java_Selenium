package org.single_inheritance;

public class Quality_Team extends Business_Analyst {
	
public void smoke_Testing()
	
	{
		System.out.println(" Perform after production launch ");
	}
	
public void regression_Testing()
	
	{
		System.out.println(" perform after smoke testing ");
	}

public void non_Functional_Testing()
{
	System.out.println(" Execute after regression testing ");
}

public static void main (String [] args)

{
	
	Quality_Team qa = new Quality_Team();
	
	qa.smoke_Testing();
	qa.regression_Testing();
	qa.non_Functional_Testing();
	
	System.out.println(" ");
	
	qa.meetings();
	qa.task_Update();
	qa.client_Calls();
	
}

}
