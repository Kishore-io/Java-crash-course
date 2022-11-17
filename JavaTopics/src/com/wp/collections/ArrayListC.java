package com.wp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//	collections works only with Objects


public class ArrayListC {

	public static void main(String[] args) {
	
//		  ArrayList internally uses a dynamic array to store the elements.
//		  An ArrayList class can act as a list only because it implements List only.
//        ArrayList is better for storing and accessing data.
		ArrayList<Integer> test=new ArrayList<>();
		
		
		test.add(10);
		test.add(11);
		test.add(15);
		test.add(12);
		test.add(11);
		test.add(7);
		test.add(2);
		
	System.out.println(test);
	
	Collections.sort(test);
	System.out.println("---after sort----");
	System.out.println(test);
	
	Collections.sort(test, Collections.reverseOrder());
	System.out.println("---after reverse sort----");
	System.out.println(test);
	
	
	}
}


//list -> ordered , contains duplicates
