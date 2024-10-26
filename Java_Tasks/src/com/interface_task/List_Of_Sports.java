package com.interface_task;

public class List_Of_Sports implements Sports{
	
	public void header()
	
	{
		System.out.println();
	}

	@Override
	public void cricket_Team() {
		
		System.out.println(" Team Criket 11 ");
		System.out.println();
		
		
	}

	@Override
	public void volly_Ball_Team() {
		
		System.out.println(" Volly Stunners ");
		System.out.println();
		
		
	}

	@Override
	public void basket_Ball_Team() {
		
		System.out.println(" Basket Rockers ");
		System.out.println();
		
	}

	@Override
	public void dangal_Team() {
		
		System.out.println(" Dangal Wrestlers ");
		System.out.println();
		
		
	}

	@Override
	public void hockey_Team() {
		
		System.out.println(" Hockey Racers ");
		System.out.println();
		
		
	}
	
	
	public static void main (String [] args)
	
	{
		List_Of_Sports l = new List_Of_Sports();
		
		l.header();
		l.cricket_Team();
		l.volly_Ball_Team();
		l.basket_Ball_Team();
		l.dangal_Team();
		l.hockey_Team();
	}

}
