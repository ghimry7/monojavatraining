package com.monocept.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiTest {

	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(10,20,50,60,40);
		
		stream.forEach((n)->{System.out.println(n);});
		
		Stream<Integer> stream1=Stream.of(100,200,500,600,400);
		
		stream1.forEach(System.out::println);
		
		List<Integer> li=Arrays.asList(10000,20000,60000,90000);
		
		li.stream().forEach(System.out::println);
	}

}
