package com.wp.exception;
import java.io.FileNotFoundException;
import java.io.IOException;

class parent
{
	
	void abc() throws IOException{
		
	}
	
	void xyz() throws FileNotFoundException{
		
	}
}

class child extends parent{
	
	// child cannot throw new checked exception
	
//	@Override
//	void abc() throws ClassNotFoundException
//	{
//		
//	}
	
//	@Override
//	void abc() throws NullPointerException, IllegalArgumentException,ArrayIndexOutOfBoundsException
//	{
//		
//	}
	
	
	@Override
	void abc() throws FileNotFoundException
	{
		
	}

	
	
//	
//	void xyz() throws IOException{
//			
//		}
	
}




public class ExceptionRulesOnOverriding {

	public static void main(String[] args) {
	

}
}

// exception : abnormal condition occurs during program execution
//and terminates the flow of program

//exception handling : protects d program frm being terminated
//try , catch , finally , throw , throws 



