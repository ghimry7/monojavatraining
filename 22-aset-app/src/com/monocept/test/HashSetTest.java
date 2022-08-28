package com.monocept.test;

import java.util.HashSet;

import com.monocept.model.Employee;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee(101,"Harsh",5000);
		Employee emp2=new Employee(102,"Patel",5000);
		Employee emp3=new Employee(101,"Harsh",5000);
		Employee emp4=new Employee(103,"Ball",5000);
		
		HashSet<Employee> employees=new HashSet<>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		System.out.println(employees);
		

	}

}
