package com.monocept.model;

public class Customer {
	private String id;
	private String name;
	private int credits;

	private static int idNo = 101;

	public Customer(String name, int credits) {
		this.id=generateId();
		this.name = name;
		this.credits = credits;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}


	public String generateId() {
		String tempId = "C" + idNo;
		idNo++;
		return tempId;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", credits=" + credits + "]";
	}

}
