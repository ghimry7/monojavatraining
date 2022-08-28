package com.monocept.interfcetest;

import com.monocept.model.*;

public class Test {

	public static void main(String[] args) {
		doDBOperation(new CustomerRepository());
		doDBOperation(new OrderRepository());
		doDBOperation(new ProductRepository());
	}

	private static void doDBOperation(IRepository inter) {
		inter.create();
		inter.read();
		inter.update();
		inter.delete();
	}

}
