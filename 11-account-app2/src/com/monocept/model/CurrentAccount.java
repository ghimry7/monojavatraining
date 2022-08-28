package com.monocept.model;

public class CurrentAccount extends Account {
	private static final int overDraft = 50000;

	public CurrentAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdraw(double amount) {

		if (this.getBalance() > amount) {
			this.setBalance(this.getBalance() - amount);
		} else if (Math.abs(this.getBalance() - amount) <= overDraft) {
			this.setBalance(this.getBalance() - amount);

		} else {
			System.out.println("Exceeds Overdraft");
		}
	}

}
