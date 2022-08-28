package com.monocept.model;

public class Thread1 extends Thread {
	DisplayTest dt;
	public Thread1(DisplayTest dt){
		this.dt=dt;
	}
	
	public void run(){
		dt.display(1);
	}
	
}
