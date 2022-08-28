package com.monocept.test;

public class ExceptionHandling {

	public static void main(String[] args) {
		int c=0;
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (RuntimeException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(c);
	}

}
