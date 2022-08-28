package com.monocept.model;

public class Boy extends Man {
	@Override
	public void read(){
		System.out.println("Boy Reading");
	}
	@Override
	public void play(){
		System.out.println("Boy playing");
	}
}
