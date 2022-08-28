package com.monocept.model;

public class Child extends Parent {
	public Child(String message){
		super("Hi");
		System.out.println("Inside Child constructor: "+message );
	}
}
