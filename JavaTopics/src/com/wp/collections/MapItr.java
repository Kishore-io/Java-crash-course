package com.wp.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapItr {

	
	public static void main(String[] args) {

		Map<Integer, String> myMap=new HashMap<>();
		
		myMap.put(18, "Virat");
		myMap.put(7, "Dhoni");
		myMap.put(10, "Sachin");
		myMap.put(45, "Rohit");
		
		
	
		
// System.out.println(myMap.entrySet());
	
		//Set<Entry<Integer, String>> myset=myMap.entrySet();
		
		//System.out.println(myset);
		
		for(Entry<Integer, String> entry:myMap.entrySet())
		{
			//System.out.println(entry);
			System.out.println(entry.getKey() + " "+entry.getValue());
		}
		
		
	}

}