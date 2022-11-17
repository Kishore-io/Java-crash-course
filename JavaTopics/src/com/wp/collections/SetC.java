package com.wp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//set-> unordered , unique

public class SetC {

	public static void main(String[] args) {

		
		Set<Integer> mySet=new HashSet<>(); 

//		Set<Integer> mySet=new TreeSet<>(); 

		mySet.add(50);
		mySet.add(90);
		mySet.add(60);
		mySet.add(10);
		mySet.add(20);
		mySet.add(200);
		mySet.add(500);
		mySet.add(20);
		
		System.out.println(mySet);
		
		List<Integer> list = new ArrayList<>(mySet);
		Collections.sort(list);
		
		System.out.println(list);
	
	}

}