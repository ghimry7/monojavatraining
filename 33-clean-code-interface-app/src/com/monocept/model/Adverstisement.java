package com.monocept.model;

public class Adverstisement {
	
	IDisplayable disObj;

	public Adverstisement(IDisplayable disObj) {
		super();
		this.disObj = disObj;
	}
	
	public void showAdvertisement(){
		disObj.display();
	}
	
}
