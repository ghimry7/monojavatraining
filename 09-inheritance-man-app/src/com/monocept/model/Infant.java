package com.monocept.model;

public class Infant extends Man {
	@Override
	public void read(){
		System.out.println("Infant Reading");
	}
	@Override
	public void play(){
		System.out.println("Infant playing");
	}
}
