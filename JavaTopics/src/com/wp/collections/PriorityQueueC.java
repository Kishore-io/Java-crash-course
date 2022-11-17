package com.wp.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;


//set-> unordered , unique

class SortByRollNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRollNo()-o2.getRollNo();
	}
	
}

public class PriorityQueueC {

	
	
	public static void main(String[] args) {


		PriorityQueue<Student> students=new PriorityQueue<>(new SortByRollNo());
		
		
		students.add(new Student(1,"abc",90));
		students.add(new Student(5,"xyz",70));
		students.add(new Student(2,"pqr",100));
		
		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());
	
	}

}