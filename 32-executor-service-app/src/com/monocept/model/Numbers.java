package com.monocept.model;

public class Numbers implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=50;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
