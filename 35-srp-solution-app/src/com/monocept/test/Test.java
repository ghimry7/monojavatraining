package com.monocept.test;

import comm.monocept.model.Account;
import comm.monocept.model.Employee;
import comm.monocept.model.HR;

public class Test {

	public static void main(String[] args)  {
		Employee e1=new Employee(123,"Mono","Delhi","10/03/2015",56000);
		HR hr=new HR();
		hr.isPromotionDue(e1);
		Account ac=new Account();
		System.out.println(ac.calculateAnnualIncome(e1));
	
	}

}
