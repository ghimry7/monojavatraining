package com.monocept.model;

public class CustomerRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Customer Created");
	}

	@Override
	public void read() {
		System.out.println("Customer read");
		
	}

	@Override
	public void update() {
		System.out.println("Customer update");
		
	}

	@Override
	public void delete() {
		System.out.println("Customer delete");
		
	}
}
