package com.monocept.set;

import java.util.HashSet;

public class HashSetApp {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(4);
		hs.add(4);
		hs.add(2);
		hs.add(3);
		System.out.println(hs);

		System.out.println(hs.remove(4));

		System.out.println(hs);

		HashSet<Integer> hs1 = new HashSet<>(hs);
		System.out.println(hs1);

		HashSet<String> hstr = new HashSet<>();

		hstr.add("A");
		hstr.add("D");
		hstr.add("B");
		hstr.add("C");

		System.out.println(hstr);

		HashSet<String> hstr1 = new HashSet<>();

		hstr1.add("E");

		hstr.addAll(hstr1);

		System.out.println(hstr);

	}

}
