package com.monocept.accounttest;

import com.monocept.model.*;

public class AccountTest {

	public static void main(String[] args) {
		AccountTest at = new AccountTest();

		Account acc[] = new Account[5];
		SavingAccount sv[]=new SavingAccount[5];
		CurrentAccount cv[]=new CurrentAccount[5];
		
		acc[0] = new Account(123, "Java", 25633);
		acc[1] = new Account(1234, "Python", 236660);
		acc[2] = new Account(12345, "C");
		acc[3] = new Account(123456, "C++", 6985500);
		acc[4] = new Account(1234567, "C#", 12365);
		
		
		sv[0]=new SavingAccount(135,"Mono",6000);
		sv[0].withdraw(4000);
		at.display(sv[0]);
		
		cv[0]=new CurrentAccount(138,"Monocept",-50000);
		cv[0].withdraw(20000);
		at.display(cv[0]);
		
		

		acc[0].deposit(77);
		System.out.println("After Deposit");
		at.display(acc[0]);

		acc[2].withdraw(100000);
		
		acc[3].withdraw(1000);
		System.out.println("After Withdraw");
		at.display(acc[2]);

		Account obj = new Account();
		Account maxBal = obj.getMaxBalAcc(acc);
		System.out.println("Max Balance Account");
		at.display(maxBal);

	}

	public void display(Account acnt) {
		System.out.print("Account No: " + acnt.getAccNumber());
		System.out.print(", Name: " + acnt.getName());
		System.out.print(", Bal: " + acnt.getBalance());
		System.out.println();
	}

}
