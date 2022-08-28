package com.monocept.test;

import com.monocept.model.*;

public class EmployeeTestCloneable {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"Java",50000);
		
		Employee e2=null;
		
		Employee e3=new Employee(e1);
		
		Employee e4=e3;
		
		try {
			System.out.println(e3);
			
			e3.setSalary(63200);
			
			System.out.println(e3);
			
			System.out.println(e4);
			e4.setSalary(200);
			System.out.println(e3);
			
			System.out.println(e1);
			
			e2=(Employee) e1.clone();
			
			System.out.println(e2);
			
			e2.setSalary(20000);
			
			System.out.println(e1);
			
			System.out.println(e2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
