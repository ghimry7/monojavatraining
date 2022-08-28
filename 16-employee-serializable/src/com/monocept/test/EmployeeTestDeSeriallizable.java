package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.monocept.model.Employee;

public class EmployeeTestDeSeriallizable {
	public static void main(String[] args){
		Employee emp=null;
		try {
			FileInputStream file=new FileInputStream("./lib/test.bin");
			
			ObjectInputStream in=new ObjectInputStream(file);
			
			emp=(Employee) in.readObject();
			
			System.out.println(emp);
			in.close();
			file.close();
			
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
