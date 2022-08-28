package com.monocept.test;

import com.monocept.model.Rectangle;
import com.monocept.model.Square;

public class Test {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle(10,20);
		
		Square square=new Square(10);
		
		if(isRect(rect)){
			System.out.println("Rectangle");
		}
		else{
			System.out.println("Not Rectangle");
		}
		
		if(isRect(square)){
			System.out.println("Rectangle");
		}
		else{
			System.out.println("Not Rectangle");
		}
		
		
		
	}
	
	public static Boolean isRect(Rectangle rect){
		int before=rect.getHeight();
		System.out.println(before);
		rect.setWidth(50);
		int after=rect.getHeight();
		System.out.println(after);
		
		return before==after;
		
		
	}

}
