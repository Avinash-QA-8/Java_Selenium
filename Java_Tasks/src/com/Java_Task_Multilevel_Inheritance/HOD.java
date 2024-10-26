package com.Java_Task_Multilevel_Inheritance;

public class HOD extends Marksheet{
	
       public void verification_1()
       
       {
    	   System.out.println(" science ");
       }
       
       public void verification_2()
       
       {
    	   System.out.println(" physics ");
       }
       
       public void verification_3()
       
       {
    	   System.out.println(" Maths ");
       }
       
       public static void main (String [] args)
       
       {
    	   HOD h = new HOD ();
    	   
    	   h.science();
    	   h.Maths();
    	   h.Social();
    	   
    	   System.out.println();
    	   
    	   h.verification_1();
    	   h.verification_2();
    	   h.verification_3();
       }

}
