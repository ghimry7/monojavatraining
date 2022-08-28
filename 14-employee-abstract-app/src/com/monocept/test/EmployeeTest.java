package com.monocept.test;

import com.monocept.model.*;


public class EmployeeTest {

	public static void main(String[] args) {
		Employee manager=new Manager(1,"Raju",55000);
		printDetails(manager);
		
		Employee dev=new Developer(2,"Rajesh",45000);
		printDetails(dev);
		
		Employee acc=new Accountant(3,"Akash",42000);
		printDetails(acc);
		

	}
	
	public static void printDetails(Employee emp){
		System.out.println(emp);
	}

}
