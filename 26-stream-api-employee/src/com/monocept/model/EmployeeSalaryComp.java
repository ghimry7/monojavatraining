package com.monocept.model;

import java.util.Comparator;

public class EmployeeSalaryComp implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary()){
			return 1;
		}
		else if(o1.getSalary()<o2.getSalary()){
			return -1;
		}
		return 0;
	}
}
