package com.monocept.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot start working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot stop working");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		throw new RuntimeException("Robot does not eat");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		throw new RuntimeException("Robot does not eat");
	}

}
