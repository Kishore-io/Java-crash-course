package com.wp.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableSort {

	public static void main(String[] args) {

		
		Student student1=new Student(4, "virat",99);
		Student student2=new Student(5, "rohit",90);
		Student student3=new Student(7, "dhoni",78);
		Student student4=new Student(2, "shami",88);

		
		ArrayList<Student> students=new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		Collections.sort(students);
		
		
		for(Student stud:students)
		{
			System.out.println(stud);
		}
		
		
	}
}


//list -> ordered , contains duplicates

