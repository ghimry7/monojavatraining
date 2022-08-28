package com.monocept.map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

		lhm.put(1,"Hello");
		lhm.put(2,"Hi");
		lhm.put(3,"jello");
		lhm.put(4,"mello");

		System.out.println(lhm);

		lhm.remove(20);

		System.out.println(lhm);

		System.out.println(lhm.size());
		
		System.out.println(lhm.replace(3, "jello", "jelly"));
		
		System.out.println(lhm);
	}

}
