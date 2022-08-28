package com.monocept.test;

import comm.monocept.model.Employee;

public class Test {

	public static void main(String[] args)  {
		Employee e1=new Employee(123,"Mono","Delhi","10/03/2015",56000);
		System.out.println("Promotion: "+e1.isPromotionDue());
		System.out.println("Annual Income: "+e1.calculateAnnualIncome());
	}

}
