package com.monocept.model;

public class ExceptionPropagation {

	public static void main(String[] args) {
		m1();
		System.out.println("Inside main method");

	}

	public static void m1() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Inside m1 method");
	}

	public static void m2() {
		m3();
		System.out.println("Inside m2 method");
	}

	public static void m3() {
		throw new RuntimeException();
		// System.out.println("Inside m3 method");
	}

}
