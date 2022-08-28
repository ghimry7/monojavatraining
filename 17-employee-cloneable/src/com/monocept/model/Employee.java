package com.monocept.model;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(Employee emp){
//		this.id = emp.id;
//		this.name = emp.name;
//		this.salary = emp.salary;
		emp=this;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary){
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
