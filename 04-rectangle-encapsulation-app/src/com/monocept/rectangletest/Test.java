package com.monocept.rectangletest;
import com.monocept.rectangle.*; 
public class Test {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		
		rectangle.setHeight(10);
		rectangle.setWidth(12);
		System.out.println(rectangle.calculateArea());
	
	}



}
