package com.monocept.test;

import java.util.Arrays;
import java.util.Comparator;

public class Task3 {

	public static void main(String[] args) {
		String[] names = { "Jay", "Nimesh", "Mark", "Mahesh", "Ramesh" };

		System.out.println("Ascending sort--------------------------");
		Arrays.stream(names
				).sorted().forEach(System.out::println);

		System.out.println("3 Ascending sort--------------------------");
		Arrays.asList(names).stream().sorted().limit(3).forEach(System.out::println);

		System.out.println("Names contains 'a'--------------------------");

		Arrays.asList(names).stream().filter(n -> n.contains("a")).sorted().limit(3).forEach(System.out::println);

		System.out.println("Decending sort--------------------------");
		Arrays.asList(names).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("First Three Characters--------------------------");
		Arrays.asList(names).stream().map(n -> n.substring(0, 3)).forEach(System.out::println);

		System.out.println("Names with <= 4 Characters--------------------------");
		Arrays.asList(names).stream().filter(n -> n.length() <= 4).forEach(System.out::println);

	}

}
