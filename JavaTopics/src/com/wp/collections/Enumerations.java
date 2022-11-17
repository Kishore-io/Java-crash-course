package com.wp.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
//import java.util.Iterator;


//Main difference b/w iterator and enumeration is that enumeration doesnot have any remove method.
public class Enumerations {

	public static void main(String[] args) {
	
		//collections works only with Objects
		ArrayList<Integer> test=new ArrayList<>();
		
		
		Integer i=10;
		
		int x=11;
		
		test.add(i);
		test.add(x);
		test.add(15);
		test.add(12);
		test.add(11);
		test.add(2, 900);
	
	System.out.println(test);
		
		Enumeration<Integer> testItr =Collections.enumeration(test);
		
		while(testItr.hasMoreElements())
		{
			
			int next=testItr.nextElement();
			System.out.println(next);
			System.out.println("plus 10 "+(next+10));
			
			if(next%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
	
	}
}


//list -> ordered , contains duplicates


