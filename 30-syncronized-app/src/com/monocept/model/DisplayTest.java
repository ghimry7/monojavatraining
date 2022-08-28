package com.monocept.model;

public class DisplayTest extends Thread {
	synchronized public void display(int n){
		for(int i=0;i<10;i++){
			System.out.println("Thread "+n+" is running!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
