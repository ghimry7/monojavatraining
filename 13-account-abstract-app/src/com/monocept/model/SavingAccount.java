package com.monocept.model;

public class SavingAccount extends Account {
	private static final int minBalance=5000;
	
	public SavingAccount(int accNo,String name,double balance){
		super(accNo,name,balance);
	}
	
	@Override
	public void withdraw(double amount){
		if(this.getBalance()>amount && (this.getBalance()-amount)>=minBalance){
			this.setBalance(this.getBalance()-amount);
		}
		else{
			System.out.println("Exceeds Min Balance!!!");
		}
	}

}
