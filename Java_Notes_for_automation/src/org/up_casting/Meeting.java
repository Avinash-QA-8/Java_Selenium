package org.up_casting;

public class Meeting extends Office {
	
	
@Override	
public void retro_Spective_Meeting_1()
	
	
	{   
	    super.retro_Spective_Meeting_1();
		System.out.println(" Feedback from alpha testers ");
	}
	
@Override
public void retro_Spective_Meeting_2()
	
	
	{   super.retro_Spective_Meeting_2();
		System.out.println(" Feedback from gamma testers  ");
	}

@Override
public void retro_Spective_Meeting_3()


{
	super.retro_Spective_Meeting_3();
	System.out.println(" Feedback from Beta testers  ");
}

public static void main (String [] args)


{
	
	Meeting m = new Meeting();
	
	m.retro_Spective_Meeting_1();
	m.retro_Spective_Meeting_2();
	m.retro_Spective_Meeting_3();
	
	
}



}
