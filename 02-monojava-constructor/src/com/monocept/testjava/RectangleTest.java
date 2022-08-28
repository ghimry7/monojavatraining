package com.monocept.testjava;
import com.monocept.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj=new Rectangle();
		int area1=obj.CalculateArea();
		RectanglePrint(obj);
		System.out.println(area1);
		Rectangle obj1=new Rectangle(10,30,5,"Blue");
		int area2=obj1.CalculateArea();
		RectanglePrint(obj1);
		System.out.println(area2);
		Rectangle obj2=new Rectangle(5,6,3);
		obj2.setBreadth(10);
		int area3=obj2.CalculateArea();
		RectanglePrint(obj2);
		System.out.println(area3);
		
	}
//	DRY
	public static void RectanglePrint(Rectangle rectangle){
		System.out.println("Rectangle color is "+rectangle.getColor());
		System.out.println(rectangle.getHeight()+"X"+rectangle.getLength()+"X"+rectangle.getBreadth());
	}

}
