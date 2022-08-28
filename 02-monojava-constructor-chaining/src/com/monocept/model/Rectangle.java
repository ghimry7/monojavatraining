package com.monocept.model;

public class Rectangle {
	private int height;
	private int length;
	private int breadth;
	private String color;
	
	public Rectangle(int height, int length, int breadth,String color) {
		this.height = height;
		this.length = length;
		this.breadth = breadth;
		this.color=color;
	}
	
	public Rectangle(){
		this(5,6,9,"white");
	}

	
	public Rectangle(int height, int length, int breadth) {
		this(height,length,breadth,"red");
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color=color;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int CalculateArea(){
		return height*length*breadth;
	}
	

}
