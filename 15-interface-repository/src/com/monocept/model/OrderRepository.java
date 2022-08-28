package com.monocept.model;

public class OrderRepository implements IRepository{

	@Override
	public void create() {
		System.out.println("Order Created");
		
	}

	@Override
	public void read() {
		System.out.println("Order read");
		
	}

	@Override
	public void update() {
		System.out.println("Order update");
		
	}

	@Override
	public void delete() {
		System.out.println("Order delete");
		
	}

}
