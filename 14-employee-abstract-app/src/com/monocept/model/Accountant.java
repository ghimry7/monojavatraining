package com.monocept.model;

public class Accountant extends Employee {
	private double perks;

	public Accountant(int empId, String name, double basicSalary) {
		super(empId, name, basicSalary);
		perks = this.getBasicSalary() * 0.2;
	}
	
	

	public double getPerks() {
		return perks;
	}



	@Override
	public double TotalCtc() {
		double totalCtc = (this.getBasicSalary() + perks) * 12;
		return totalCtc;

	}

	@Override
	public String toString() {
		return "Accountant [Emp Id="+this.getEmpId()+", Name="+this.getName()+", Basic Salary="+this.getBasicSalary()+", Perks="+ perks + ", Total CTC=" + TotalCtc() + "]";
	}
	
	
	
	

}
