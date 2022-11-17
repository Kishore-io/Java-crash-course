package com.wp.collections;

public class Employee {

	private int rollNo;
	private String name;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int rollNo, String name, int salary) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
