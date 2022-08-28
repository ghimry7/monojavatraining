package com.monocept.rectangle;

public class Rectangle {
	private int height;
	private int width;
	String h;
	
	
	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = validate(height);
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = validate(width);
	}


	public int calculateArea(){
		return height*width;
	}
	
	
	private static int validate(int value) {
		if(value<1){
			return 1;
		}
		else if(value>100){
			return 100;
		}
		else{
			return value;
		}
	}

}
