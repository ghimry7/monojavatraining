package com.monocept.model;

public class Supervisor implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Worker start working");

	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Worker stop working");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("Worker start eating");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("Worker start eating");
	}

}
