package com.monocept.model;

public class Square implements IShape{

	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return side*side;
	}
	
	

	
	
	

}
