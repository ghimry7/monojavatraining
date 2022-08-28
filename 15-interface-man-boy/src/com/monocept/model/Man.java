package com.monocept.model;

public class Man implements IMannerable,IEmotional {
	
	@Override
	public void cry() {
		System.out.println("Man Cry");
	}

	@Override
	public void laugh() {
		System.out.println("Man Laugh");

	}

	@Override
	public void greet() {
		System.out.println("Man Greet");
		
	}

	@Override
	public void depart() {
		System.out.println("Man Depart");
		
	}

}
