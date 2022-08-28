package com.monocept.test;

import java.util.Arrays;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,20,30,40,50,25,35,45);
		System.out.println(numbers.stream().min(Integer::compare).get());
		System.out.println(numbers.stream().max(Integer::compare).get());
	}

}
