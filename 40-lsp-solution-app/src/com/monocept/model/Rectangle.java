package com.monocept.model;

public class Rectangle implements IShape{
	private int height;
	private int width;
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		return height*width;
	}
	
	
}
