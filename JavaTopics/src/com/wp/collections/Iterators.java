package com.wp.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class Iterators {

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
		
		Iterator testItr =test.iterator();
		
		
		while(testItr.hasNext())
		{
			
			int next=(int) testItr.next();
			System.out.println(next);
			System.out.println("plus 10 "+(next+10));
			
			if(next%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
		
		ListIterator idx = test.listIterator();
		
		while(idx.hasPrevious())
		{
			
			int prev= (int) idx.previous();
			System.out.println(prev);
			System.out.println("Minus 10 "+(prev-10));
			
			if(prev%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
	
	}
}


//list -> ordered , contains duplicates

