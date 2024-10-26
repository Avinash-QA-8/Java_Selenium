package org.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_HashMap {
	
	public static void main (String [] args)
	
	{
		
		Map <Object,Object> m = new LinkedHashMap <Object, Object> ();
		
		m.put("89", "sort");
		
		m.put(null, 89);
		
		m.put("PRODUCT",34.98);
		
		m.put(null, "size");
		
		m.put("70 mm ", null);
		
		m.put("system_of_formation_7", "sort");
		
		m.put(345.48495, 89);
		
		m.put("PRODUCT", 3.455);
		
		m.put("Iphone", 45);
		
		System.out.println(m);
	}

}
