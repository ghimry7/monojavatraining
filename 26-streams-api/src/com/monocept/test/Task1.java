package com.monocept.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {
		String[] names= {"Jayesh","Nimesh","Mahesh","Ramesh"};
		
		Stream<String> stream=Stream.of(names);
		
		
		Arrays.stream(names).forEach(System.out::println);
		
		Arrays.asList(names).stream().forEach(System.out::println);
	}

}
