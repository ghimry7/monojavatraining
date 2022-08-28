package com.monocept.test;

import com.monocept.model.Rectangle;
import com.monocept.model.Square;

public class Test {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 20);
		System.out.println(rect.calculateArea());

		Square square = new Square(10);
		System.out.println(square.calculateArea());
		if (isRect(rect)) {
			System.out.println("Rectangle");
		} else {
			System.out.println("Not Rectangle");
		}

		// if(isRect(square)){
		// System.out.println("Rectangle");
		// }
		// else{
		// System.out.println("Not Rectangle");
		// }

	}

	public static Boolean isRect(Rectangle rect) {
		int before = rect.getHeight();
		rect.setWidth(50);
		int after = rect.getHeight();

		return before == after;

	}

}
