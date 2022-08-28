package com.monocept.model;

public class Manager extends Employee {
	private double hra;
	private double da;
	private double ta;

	public Manager(int empId, String name, double basicSalary) {
		super(empId, name, basicSalary);
		hra = this.getBasicSalary() * 0.3;
		da = this.getBasicSalary() * 0.2;
		ta = this.getBasicSalary() * 0.1;
	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getTa() {
		return ta;
	}

	@Override
	public double TotalCtc() {
		double totalCtc = (this.getBasicSalary() + hra + da + ta) * 12;
		return totalCtc;

	}

	@Override
	public String toString() {
		return "Manager [Emp Id="+this.getEmpId()+", Name="+this.getName()+", Basic Salary="+this.getBasicSalary()+", HRA="+ hra + ", DA=" + da + ", TA=" + ta + ", Total CTC="+ TotalCtc() +"]";
	}
	
	
	
	

}
