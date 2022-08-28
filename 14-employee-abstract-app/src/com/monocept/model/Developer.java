package com.monocept.model;

public class Developer extends Employee {
	private double pa;
	private double ota;
	
	public Developer(int empId, String name, double basicSalary) {
		super(empId, name, basicSalary);
		pa = this.getBasicSalary()*0.25;
		ota = this.getBasicSalary()*0.1;
	}

	public double getPa() {
		return pa;
	}

	public double getOta() {
		return ota;
	}

	@Override
	public double TotalCtc() {
		double totalCtc = (this.getBasicSalary() + pa + ota) * 12;
		return totalCtc;
	}

	@Override
	public String toString() {
		return "Developer [Emp Id="+this.getEmpId()+", Name="+this.getName()+", Basic Salary="+this.getBasicSalary()+", PA="+ pa + ", OTA=" + ota + ", Total CTC=" + TotalCtc() + "]";
	}
	
	
	
	
	
	
	

}
