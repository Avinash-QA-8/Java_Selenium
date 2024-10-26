package org.list_pratice;

import java.util.ArrayList;
import java.util.List;

public class Array_List_Concept {

	public static void main (String [] args)
	
	{
		List <Object> l = new ArrayList<Object> ();
		
		l.add(34);
		
		l.add("IP address");
		
		l.add(78);
		
		l.add(null);
		
		l.add("student");
		
		l.add(true);
		
		System.out.println(l);
		
		System.out.println();
		
		int size = l.size();
		System.out.println(size);
		
		System.out.println();
		
		Object object = l.get(3);
		System.out.println(object);
		
		System.out.println();
		
		l.set(4, "top");
		System.out.println(l);
		
		
		
	
		
		
	}
}
