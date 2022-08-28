package com.monocept.model;

public class ProductRepository implements IRepository{

	@Override
	public void create() {
		System.out.println("Product Created");
		
	}

	@Override
	public void read() {
		System.out.println("Product read");
		
	}

	@Override
	public void update() {
		System.out.println("Product update");
		
	}

	@Override
	public void delete() {
		System.out.println("Product delete");
		
	}

}
