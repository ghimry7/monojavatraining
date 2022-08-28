package com.monocept.model;

public class Thread2 extends Thread {
	DisplayTest dt;
	public Thread2(DisplayTest dt){
		this.dt=dt;
	}
	
	public void run(){
		dt.display(2);
	}
	
}
