package com.wp.collections;

import java.util.concurrent.ArrayBlockingQueue;


//set-> unordered , unique

public class ArrayBlockingQueueC {

	
	
	public static void main(String[] args) {

//		ArrayBlockingQueue class is a bounded blocking queue backed by an array. By bounded, 
//		it means that the size of the Queue is fixed. Once created, the capacity cannot be changed.

		ArrayBlockingQueue<String> cities=new ArrayBlockingQueue<>(8);
		
		
		cities.add("Bangalore");
		cities.add("Bijapur");
		cities.add("Bidar");
		cities.add("Gulbarga");
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Sholapur");
		cities.add("Mysore");
		
		
		System.out.println(cities);
	
//		element number 9 to a queue which has max capacity of 8
//		cities.add("Hubli");
		//Exception in thread "main" java.lang.IllegalStateException: Queue full
		
		
		
		//element number 9 to a queue which has max capacity of 8
		cities.offer("Hubli");
				
		
		
		
	
	}

}