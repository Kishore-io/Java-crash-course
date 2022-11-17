package com.wp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deseralize {

	public static void main(String[] args) {


		try {
			FileInputStream fs=new FileInputStream("mydata.ser");
			ObjectInputStream oout=new ObjectInputStream(fs);
			Employee emp=(Employee) oout.readObject();
			
		System.out.println(emp);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
