package com.wp.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


// keySet()	
// This method returns the Set view of all the keys present in the map, ie it returns a set of keys.

// entrySet()
// This method returns the Set view of all the mappings present in the map, ie it returns a set of key, value pairs.

public class MapC {

	
	public static void main(String[] args) {

		Map<Integer, String> myMap=new HashMap<>();
		
		myMap.put(18, "Virat");
		myMap.put(7, "Dhoni");
		myMap.put(10, "Sachin");
		myMap.put(45, "Rohit");
		
		
		//System.out.println(myMap.get(7));
	
		
		Set<Integer> keys= myMap.keySet();
		
		
		//System.out.println(keys);
		
		for(int key:keys)
		{
			System.out.println(key + " "+myMap.get(key));
		}
		
		
		
	}

}