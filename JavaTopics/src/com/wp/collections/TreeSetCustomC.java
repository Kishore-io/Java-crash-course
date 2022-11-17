package com.wp.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


//set-> unordered , unique

class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getName().compareTo(o1.getName());
	}
	
}

public class TreeSetCustomC {

	
	public HashSet<Student> getStudents(){
		
		HashSet<Student> mySet=new HashSet<>(); 
		mySet.add(new Student(18, "Virat", 99));
		mySet.add(new Student(7, "Dhoni", 60));
		mySet.add(new Student(45, "Rohit", 90));
		mySet.add(new Student(1, "Rahul", 70));
		mySet.add(new Student(19, "Shami", 99));
		mySet.add(new Student(20, "Yuvi", 96));
		mySet.add(new Student(21, "Sachin", 88));
		mySet.add(new Student(22, "Jaddu", 61));
		return mySet;
	}
	
	
	public static void main(String[] args) {

		TreeSetCustomC d8=new TreeSetCustomC();
		HashSet<Student> hset=d8.getStudents();
		
		TreeSet<Student> tset=new TreeSet<>(new SortByName());
		tset.addAll(hset);
		
		for(Student stud:tset)
		{
			System.out.println(stud);
		}
		
	}

}