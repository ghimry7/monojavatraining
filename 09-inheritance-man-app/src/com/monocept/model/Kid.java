package com.monocept.model;

public class Kid extends Man {
	@Override
	public void read(){
		System.out.println("Kid Reading");
	}
	@Override
	public void play(){
		System.out.println("Kid playing");
	}
}
