package com.monocept.rectangletest;
import com.monocept.rectangle.*;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
		rectangle.height=rectangle.validate(height);
		int width=sc.nextInt();
		rectangle.width=rectangle.validate(width);
		System.out.println(rectangle.calculateArea());
	
	}



}
