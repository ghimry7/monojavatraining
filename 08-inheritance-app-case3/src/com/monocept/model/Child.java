package com.monocept.model;

public class Child extends Parent {
	String message;
	public Child(String message){
		System.out.println("Inside Child constructor: "+message );
	}
}
