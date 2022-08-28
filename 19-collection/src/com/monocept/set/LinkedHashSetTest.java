package com.monocept.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

		lhs.add(20);
		lhs.add(10);
		lhs.add(50);
		lhs.add(80);
		lhs.add(40);
		lhs.add(70);

		System.out.println(lhs);

		lhs.remove(20);

		System.out.println(lhs);

		System.out.println(lhs.size());

	}

}
