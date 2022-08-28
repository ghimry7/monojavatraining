package com.monocept.test;

import com.monocept.model.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		Account ac = new Account(101, "Java", 5000);
		ac.withdraw(10000);
		System.out.println(ac);

	}
}
