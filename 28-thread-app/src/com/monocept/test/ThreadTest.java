package com.monocept.test;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// Aplhabets alpha = new Aplhabets();
		// alpha.start();
		// System.out.println("Main method");
		//
		//
		// Numbers n = new Numbers();
		// Thread tobj = new Thread(n);
		// tobj.start();

		Runnable runObj1 = new Runnable() {

			@Override
			public void run() {
				for (char ch = 'A'; ch <= 'Z'; ch++) {
					System.out.println(ch);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		};

		Thread t1 = new Thread(runObj1);
		t1.start();

		Runnable runObj2 = () -> {

			for (char ch = 'a'; ch <= 'z'; ch++) {
				System.out.println(ch);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};
		Thread t2 = new Thread(runObj2);
		t2.start();
		
		Runnable runObj3=ThreadTest::execute;
		Thread t3 = new Thread(runObj3);
		t3.start();
		

	}
	public static void execute(){
		System.out.println("Inside execute method!!!");
	}
}
