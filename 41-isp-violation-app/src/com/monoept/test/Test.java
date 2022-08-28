package com.monoept.test;

import com.monocept.model.IWorker;
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
		atEating(rb);

	}

	public static void atWorking(IWorker work) {
		work.startWork();
		work.stopWork();
	}

	public static void atEating(IWorker work) {
		work.startEat();
		work.stopEat();
	}

}
