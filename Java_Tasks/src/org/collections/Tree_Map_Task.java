package org.collections;


import java.util.Map;
import java.util.TreeMap;

public class Tree_Map_Task {
	
public static void main (String [] args)
	
	{
		
		Map <Object,Object> m = new TreeMap <Object, Object> ();
		
		m.put(67, 89);
		
		m.put(34, 45);
		
		m.put(67, 89);
		
		m.put(34, 67);
		
		m.put(45, 56);
		
		System.out.println(m);
	}

}
