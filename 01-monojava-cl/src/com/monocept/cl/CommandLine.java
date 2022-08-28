package com.monocept.cl;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Total number of values: "+args.length);
		for(String name:args){
			System.out.println(name);
		}

	}

}
