package com.monocept.model;

public class Employee {
	private int id;
	private String name;
	public int salary;
	String designation;
	protected static String school;

	public Employee(int id, String name, int salary,String designation,String school) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation=designation;
		this.school=school;
	}
	
	public Employee(){
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
