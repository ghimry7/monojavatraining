package com.monocept.model;

public class Account {
	private int accNumber;
	private String name;
	private double balance;

	public Account(int accNumber, String name, double balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int accNumber, String name) {
		this(accNumber,name,15000);
	}
	
	public Account(){
		
	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			throw new InsuffiecientBalanceException("Insufficent Balance");
		}

	}
}
