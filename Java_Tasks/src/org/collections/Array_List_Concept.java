package org.collections;

import java.util.ArrayList;
import java.util.List;

public class Array_List_Concept {
	
	public static void main (String [] args)

	
	{
		
		List <Object> l = new ArrayList <Object> ();
		
		l.add(null);
		
		l.add("Jiiva");
		
		l.add(34);
		
		l.add(89);
		
		l.add(true);
		
		l.add('T');
		
		l.add("The King of Thunder ");
		
		l.add(45.788);
		
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		Object obj = l.get(3);
		System.out.println(obj);
		
		Object set = l.set(4, "Universal Kingdom");
		System.out.println(l);
		
		l.remove(6);
		System.out.println(l);
	
		int indexOf = l.indexOf('T');
		System.out.println(indexOf);
		
		int lastIndexOf = l.lastIndexOf(89);
		System.out.println(lastIndexOf);
		
		l.clear();
		System.out.println(l);
		
		

		
		
		
		
		
		
	}
}
