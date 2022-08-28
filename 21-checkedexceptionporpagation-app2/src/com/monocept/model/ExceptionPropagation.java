package com.monocept.model;

public class ExceptionPropagation {

	public static void main(String[] args) throws Exception {
		m1();
		System.out.println("Inside main method");

	}

	public static void m1() throws Exception {

		m2();

		System.out.println("Inside m1 method");
	}

	public static void m2() throws Exception {
		m3();
		System.out.println("Inside m2 method");
	}

	public static void m3() throws Exception {
		throw new Exception();
		// System.out.println("Inside m3 method");
	}

}
