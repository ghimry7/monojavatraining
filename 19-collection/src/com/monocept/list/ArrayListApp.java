package com.monocept.list;

import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();

		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);

		System.out.println(li);
		
		System.out.println(li.size());
		
		int item=li.get(3);
		
		System.out.println(item);

		li.remove(2);// removes item from first

		System.out.println(li);
		
		Integer ar[]=new Integer[li.size()];
		
		ar=li.toArray(ar);
		
		for(Integer i:ar){
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		li.removeAll(li);
		
		System.out.println(li);
	}

}
