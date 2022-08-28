package com.monocept.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(10,20,56,99,33,1,25,48,68,100);
		
		List<Integer> al1=new ArrayList<>();
		
		for(int ele:al){
			if(ele%2==0){
				al1.add(ele);
			}
		}
		
		System.out.println(al1);
		
		System.out.println("Using Stream------------------");
		
		al.stream().filter(ele->ele%2==0).forEach(System.out::println);
		
	}

}
