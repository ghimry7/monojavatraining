package com.monocept.test;

import com.monocept.model.*;

public class PrintableTest {
	
	public PrintableTest(){
		System.out.println("Inside Constructor");
	}

	public static void main(String[] args) {
		IPrintable print = new Calender();
		print.printGreeting();

		// anonymous class

		IPrintable printA = new IPrintable() {

			@Override
			public void printGreeting() {
				System.out.println("Happy New Year");
			}
		};
		
		printA.printGreeting();

		// lambda
		IPrintable printL = ()-> {
				System.out.println("Happy New Year");
			
		};
		
		printL.printGreeting();
		
		//static Method reference
		
		IPrintable printS=PrintableTest::display;
		printS.printGreeting();
		
		//method reference
		IPrintable printNS=new PrintableTest()::displays;
		printNS.printGreeting();
		
		//Constructor
		IPrintable con=PrintableTest::new;
		con.printGreeting();
		

}
	public static void display(){
		System.out.println("Happy New Year");
	}
	
	public  void displays(){
		System.out.println("Happy New Year");
	}

}
