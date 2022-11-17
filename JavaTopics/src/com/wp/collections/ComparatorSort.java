package com.wp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class RollNoSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary()-o2.getSalary();
	}
	
}

class NameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class ComparatorSort {

	public static void main(String[] args) {

		
		Employee emp1=new Employee(4, "Rayudu",44000);

		Employee emp2=new Employee(3, "Rohit",45000);

		Employee emp3=new Employee(1, "Dhoni",90000);

		Employee emp4=new Employee(2, "Virat",50000);

		
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		Collections.sort(employees,new RollNoSort());
		
		System.out.println("Sorted By Salary: ");
		
		for(Employee emp:employees)
		{
			System.out.println(emp);
		}
		
	System.out.println("\nSorted By Name: ");	

	Collections.sort(employees,new NameSort());
	
	
	for(Employee emp:employees)
	{
		System.out.println(emp);
	}

	
	
	}
}


//list -> ordered , contains duplicates
