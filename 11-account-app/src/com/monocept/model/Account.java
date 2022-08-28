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
			System.out.println("Less Balance");
		}

	}
	
	public Account getMaxBalAcc(Account accounts[]){
		Account x=null;
		double max=0;
		for(int i=0;i<accounts.length;i++){
			if(accounts[i].getBalance()>max){
				max=accounts[i].getBalance();
				x=accounts[i];
			}
		}
		return x;
	}

}
