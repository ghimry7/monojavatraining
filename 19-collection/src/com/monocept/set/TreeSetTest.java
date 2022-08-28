package com.monocept.set;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(20);
		ts.add(10);
		ts.add(50);
		ts.add(80);
		ts.add(40);
		ts.add(70);

		System.out.println(ts);

		System.out.println(ts.pollFirst());

		System.out.println(ts.pollLast());

		System.out.println(ts);

		System.out.println(ts.descendingSet());
	}

}
