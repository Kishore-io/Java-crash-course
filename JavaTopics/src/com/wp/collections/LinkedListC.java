package com.wp.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


//set-> unordered , unique

public class LinkedListC {

	
	
	public static void main(String[] args) {

		//LinkedList internally uses a doubly linked list to store the elements.
		//LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
		//LinkedList is better for manipulating data
		LinkedList<String> cities=new LinkedList<String>();
		
		
		cities.add("Bangalore");
		cities.add("Bijapur");
		cities.add("Bidar");
		cities.add("Gulbarga");
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Sholapur");
	
		
		System.out.println(cities);
		
			cities.remove();
			System.out.println("after remove");	
			System.out.println(cities);
	//-------------------------------------------------------
			
			System.out.println("poll "+cities.poll());
			
			System.out.println("after poll");
			System.out.println(cities);
			
		//--------------------------------------------
			
			System.out.println("peek "+cities.peek());
			
			System.out.println("after peek");
			System.out.println(cities);
	//--------------------------------------------------
			
			
			System.out.println(cities.pollLast());
			System.out.println(cities);
			
			System.out.println(cities.peekLast());
			System.out.println(cities);
			
	}

}