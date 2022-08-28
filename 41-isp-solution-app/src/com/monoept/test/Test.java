package com.monoept.test;

import com.monocept.model.IEat;
import com.monocept.model.IWork;
import com.monocept.model.Robot;
import com.monocept.model.Supervisor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supervisor sp = new Supervisor();

		Robot rb = new Robot();

		atWorking(sp);
		atEating(sp);

		atWorking(rb);
		

	}

	public static void atWorking(IWork work) {
		work.startWork();
		work.stopWork();
	}

	public static void atEating(IEat eat) {
		eat.startEat();
		eat.stopEat();
	}

}
