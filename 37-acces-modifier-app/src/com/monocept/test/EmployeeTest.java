package com.monocept.test;

import com.monocept.model.Employee;
import com.monocept.model.HR;

public class EmployeeTest extends Employee{

	public static void main(String[] args) {
		Employee e=new Employee(123,"Java",500,"Developer","PMS");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.salary);
		System.out.println(school);
		
		System.out.println("------------------------------------");
		
		HR hr=new HR(123,"Python",5000,"Developer","JKS");
		hr.disp();
		
	}

}
