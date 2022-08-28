package com.monocept.model;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		super.setHeight(height);
		super.setWidth(height);
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		super.setHeight(width);
		super.setWidth(width);
	}

	
	
	

}
