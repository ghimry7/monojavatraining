package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.monocept.model.Employee;

public class EmployeeTestSeriallizable {
	public static void main(String[] args){
		Employee emp=new Employee(101,"Monocept",50000);
		
		try {
			FileOutputStream file=new FileOutputStream("./lib/test.bin");
			
			ObjectOutputStream out=new ObjectOutputStream(file);
			
			out.writeObject(emp);
			out.close();
			file.close();
			System.out.println("Serialize");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
