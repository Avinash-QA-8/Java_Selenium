package com.Java_Task_Multilevel_Inheritance;

public class Teachers extends HOD {
	
	public void Validation_1()
    
    {
 	   System.out.println(" Sandiya ");
    }
    
    public void Validation_2()
    
    {
 	   System.out.println(" Rani ");
    }
    
    public void Validation_3()
    
    {
 	   System.out.println(" Devika ");
 	   
    }
    
    public static void main (String [] args)
    
    {
    	Teachers t = new Teachers();
    	
    	t.verification_1();
    	t.verification_2();
    	t.verification_3();
    	
    	System.out.println();
    	
    	t.Validation_1();
    	t.Validation_2();
    	t.Validation_3();
    	
    	System.out.println();
    	
    	t.science();
    	t.Maths();
    	t.Social();
    	
    }

}
