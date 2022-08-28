package com.monocept.test;
import com.monocept.model.Child;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj;
		obj=100;
		System.out.println(obj.getClass());
		obj="Hello";
		System.out.println(obj.getClass());
		obj=50>2;
		System.out.println(obj.getClass());
	}
	
}
