package com.monocept.map;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		
		tm.put(1,"Hello");
		tm.put(2,"Hi");
		tm.put(3,"jello");
		tm.put(4,"mello");
		
		System.out.println(tm);
		
		System.out.println(tm.firstKey());
		
		System.out.println(tm.lastKey());
		
		
	}

}
