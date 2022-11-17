package com.wp.string;

public class StringImutabale {

	public static void main(String []a) {        
	 	
		StringImutabale q1=new StringImutabale();
		
		String x="hello";
		x.concat("world");
		System.out.println(x);
		//--------------------------
		
		System.out.println("----------------------");

		// Not synchronized and Not Thread safe
		StringBuilder sb=new StringBuilder("hello");	
		sb.append("world");
		System.out.println(sb);
		
		
		System.out.println("----------------------");

		// synchronized and Thread safe
		StringBuffer sb1=new StringBuffer("hello");	
		sb1.append("world");
		System.out.println(sb1);
		
		
		
		
	}

}