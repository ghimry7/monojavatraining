package com.monocet.test;

import com.monocept.model.*;

public class Test {

	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
		toReadandPlay(new Man());
		toReadandPlay(new Boy());
		toReadandPlay(new Kid());
		toReadandPlay(new Infant());
		
	}

	private static void toReadandPlay(Man man) {
		man.read();
		man.play();
	}

	private static void case1() {
		Man man = new Man();
		man.read();
		man.play();

	}

	private static void case2() {
		Boy boy = new Boy();
		boy.read();
		boy.play();
	}

	private static void case3() {
		Man man = new Kid();
		man.read();
		man.play();
	}

	private static void case4() {
		// Boy boy=new Man();
	}

}
