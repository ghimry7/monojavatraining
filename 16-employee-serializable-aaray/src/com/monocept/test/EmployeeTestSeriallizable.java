package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.monocept.model.Employee;

public class EmployeeTestSeriallizable {
	public static void main(String[] args) {
		Employee emp[] = new Employee[5];
		emp[0] = new Employee(101, "Mono", 5000);
		emp[1] = new Employee(102, "Cept", 6000);
		emp[2] = new Employee(103, "Java", 7000);
		emp[3] = new Employee(104, "Python", 8000);
		emp[4] = new Employee(105, "c++", 9000);

		try {
			FileOutputStream file = new FileOutputStream("./lib/test.bin");

			ObjectOutputStream out = new ObjectOutputStream(file);

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
