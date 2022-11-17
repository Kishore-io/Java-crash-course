package com.wp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Seralize {

	public static void main(String []a) {        
	 
		Employee employee=new Employee(50,"Virat Kohli");

		//create file
		//write data into it ... 
		//employee.empId ,
		//employee.empName

// storing object - > process of storing the state of object is called serialization		
		
		
		
		try {
			FileOutputStream fs=new FileOutputStream("mydata.ser");
			ObjectOutputStream oout=new ObjectOutputStream(fs);
			oout.writeObject(employee);
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
