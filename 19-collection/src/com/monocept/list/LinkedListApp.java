package com.monocept.list;

import java.util.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {

		LinkedList<Integer> li = new LinkedList<>();

		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);

		System.out.println(li);

		System.out.println(li.size());

		int item = li.get(3);

		System.out.println(item);

		li.addFirst(100);

		System.out.println(li);

		li.addLast(101);

		System.out.println(li);

		li.remove();// removes item from first

		System.out.println(li);

		li.removeLast();

		System.out.println(li);

		li.removeAll(li);

		System.out.println(li);

	}

}
