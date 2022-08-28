package com.monocept.accounttest;

import com.monocept.model.*;

public class AccountTest {

	public static void main(String[] args) {
		AccountTest at = new AccountTest();
		

		SavingAccount sv;
		CurrentAccount cv;

		sv = new SavingAccount(135, "Mono", 6000);
		sv.withdraw(4000);
		at.display(sv);
		
		cv = new CurrentAccount(138, "Monocept", 10000);
		cv.withdraw(20000);
		at.display(cv);

		cv = new CurrentAccount(138, "Monocept", -50000);
		cv.withdraw(20000);
		at.display(cv);

	}

	public void display(Account acnt) {
		System.out.print("Account No: " + acnt.getAccNumber());
		System.out.print(", Name: " + acnt.getName());
		System.out.print(", Bal: " + acnt.getBalance());
		System.out.println();
	}

}
