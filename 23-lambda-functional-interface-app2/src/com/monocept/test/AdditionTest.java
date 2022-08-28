package com.monocept.test;

import com.monocept.model.*;

public class AdditionTest {

	public static void main(String[] args) {
		//1 Object
		IAddable x1 = new Adding();
		System.out.println(x1.addition(5, 2));
		//2 Anonymous
		IAddable x2=new IAddable() {
			
			@Override
			public int addition(int a, int b) {
				return a+b;
			}
		};

		System.out.println(x2.addition(10, 20));
		
		//3 Lambda
		IAddable x3=(a,b)->a+b;
		
		
		System.out.println(x3.addition(50, 60));
		
		//passing lamda
		sum(x3);
		
		//4 Static method reference
		IAddable x4=AdditionTest::add;
		System.out.println(x4.addition(100, 200));
		
		//5 Non-static Method reference
		IAddable x5=new AdditionTest()::adds;
		System.out.println(x5.addition(100, 600));
		
		
	}
	
	private static void sum(IAddable x3) {
		System.out.println(x3.addition(60, 80));
	}

	public static int  add(int a,int b){
		return a+b;
	}
	
	public  int  adds(int a,int b){
		return a+b;
	}

}
