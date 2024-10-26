package org.final_task;

public final class Client_Projects {
	
	
	public final void project_1()
	
	{
		String name = " Kochava ";
		
		int time_duration = 4;
		
		System.out.println(" The first project name:  " +name);
		
		System.out.println(" The time duration is: " +time_duration);
		
		System.out.println();
	}
	
	
	public final void project_2()
	
	{
        String name_1 = " Equali's Group ";
		
		int time_duration_1 = 3;
		
		System.out.println(" The first project name:  " +name_1);
		
		System.out.println(" The time duration is: " +time_duration_1);
		
		System.out.println();
		
	}
	
    public final void project_3()
	
	{
        String name_2 = " Venus ";
		
		int time_duration_2 = 6;
		
		System.out.println(" The first project name:  " +name_2);
		
		System.out.println(" The time duration is: " +time_duration_2);
		
		System.out.println();
		
	}
    
    
    public static void main (String [] args)
    
    {
    	
    	Client_Projects c = new Client_Projects();
    	
    	c.project_1();
    	c.project_2();
    	c.project_3();
    }
	

}
