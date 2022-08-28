package com.monocept.rectangle;

public class Rectangle {
	public int height;
	public int width;
	
	public int calculateArea(){
		return height*width;
	}
	
	
	public int validate(int value) {
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
