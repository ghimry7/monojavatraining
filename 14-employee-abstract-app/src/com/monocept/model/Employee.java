package com.monocept.model;

public abstract class Employee {
	private int empId;
	private String name;
	private double basicSalary;
	
	public Employee(int empId, String name, double basicSalary) {
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}
	
	public abstract double TotalCtc();
	
	
	
	
	

}
