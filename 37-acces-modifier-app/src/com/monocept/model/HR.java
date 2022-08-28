package com.monocept.model;

public class HR extends Employee {

	public HR(int id, String name, int salary, String designation, String school) {
		super(id, name, salary, designation, school);
	}

	public void disp() {
		System.out.println(designation);
		System.out.println(school);
	}

}
