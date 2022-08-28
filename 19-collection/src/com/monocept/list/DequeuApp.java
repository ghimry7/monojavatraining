package com.monocept.list;

import java.util.Deque;
import java.util.LinkedList;

public class DequeuApp {

	public static void main(String[] args) {
		Deque<Integer> dq = new LinkedList<>();

		dq.add(1);
		dq.add(2);
		dq.add(3);

		System.out.println(dq);

		dq.addFirst(0);

		System.out.println(dq);

		dq.addLast(4);

		System.out.println(dq);

		System.out.println(dq.getFirst());

		System.out.println(dq.getLast());

		if (dq.offerFirst(-1)) {
			System.out.println("Item Added");
		}
		System.out.println(dq);

		if (dq.offerLast(5)) {
			System.out.println("Item Added");
		}
		System.out.println(dq);

		System.out.println(dq.peekFirst());

		System.out.println(dq.peekLast());

		System.out.println(dq.pollFirst());// return and removes the element

		System.out.println(dq);

	}

}
