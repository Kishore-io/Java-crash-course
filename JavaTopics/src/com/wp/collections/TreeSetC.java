package com.wp.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


//set-> unordered , unique

public class TreeSetC {

	
	public HashSet<Integer> getElements(){
		
		HashSet<Integer> mySet=new HashSet<>(); 
		mySet.add(50);
		mySet.add(90);
		mySet.add(60);
		mySet.add(10);
		mySet.add(20);
		mySet.add(200);
		mySet.add(500);
		mySet.add(20);
		return mySet;
	}
	
	
	public static void main(String[] args) {

		TreeSetC d8=new TreeSetC();
		HashSet<Integer> hset=d8.getElements();
		
		TreeSet<Integer> tset=new TreeSet<>();
		tset.addAll(hset);
		
		System.out.println(tset);
		
	}

}
