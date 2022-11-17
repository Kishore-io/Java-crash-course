package com.wp.inheritance;

//child inherits everything from parent except private and constructor

class parent{
	int x=100;
	void test() {
		System.out.println("test parent method");
	}
	
	private void testing() {
		System.out.println("test parent method");
	}
}

class child extends parent{
	
	public child() {
	System.out.println("child x "+ x);
	}
}

public class Inheritance {

	public static void main(String[] args) {
	
		child c=new child();
		c.test();
//		c.testing();
}
}


