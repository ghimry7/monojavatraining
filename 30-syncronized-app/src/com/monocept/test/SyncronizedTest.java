package com.monocept.test;

import com.monocept.model.DisplayTest;
import com.monocept.model.Thread1;
import com.monocept.model.Thread2;

public class SyncronizedTest {

	public static void main(String[] args) {
		DisplayTest dt=new DisplayTest();
		Thread1 t1=new Thread1(dt);
		Thread2 t2=new Thread2(dt);
		
		t1.start();
		t2.start();
	}

}
