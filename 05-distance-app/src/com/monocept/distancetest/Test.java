package com.monocept.distancetest;
import com.monocept.distance.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance d1=new Distance(10,7);
		Distance d2=new Distance(7,35);
		Distance d3=d1.add(d2);
		System.out.println(d3);

	}

}
