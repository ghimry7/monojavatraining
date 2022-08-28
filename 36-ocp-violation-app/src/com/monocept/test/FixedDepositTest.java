package com.monocept.test;

import com.monocept.model.FestivalType;
import com.monocept.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit("Raju", 5000, 3, FestivalType.Diwali);

		System.out.println("Name: " + fd.getName());

		System.out.println("Principle amount: " + fd.getPrinciple());

		System.out.println("Interest Rates: " + fd.getInterestRates());

		System.out.println("Simple Interest: " + fd.calculateSimpleInterest());
	}

}
