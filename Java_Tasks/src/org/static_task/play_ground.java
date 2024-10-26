package org.static_task;

public class play_ground {
	
	static int basket_ball = 3;
	
	public static void net()
	
	{
		int net_count = 4; 
		
		System.out.println(" The number of net's are : " +net_count);
		System.out.println();
		
	}
	
	public static void team_1()
	
	{
		String team_name = "Alpha";
		
		System.out.println(" The First Team name is:  " +team_name);
		System.out.println();
	}
	
	public static void team_2()
	
	{
		String team_name2 = "Beta";
		
		System.out.println(" The Second team name is:  " +team_name2);
		System.out.println();
	}
	
	static
	
	{
		System.out.println(" 2024 International Basket Ball Tournament ..... ");
		System.out.println();
	}
	
	
	public static void main (String [] args)
	
	{
		net();
		
		team_1();
		
		team_2();
		
		System.out.println("The number of the play is : "+basket_ball);
			
		
	}

}
