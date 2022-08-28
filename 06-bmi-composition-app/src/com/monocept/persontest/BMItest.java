package com.monocept.persontest;

import com.monocept.person.*;

public class BMItest {

	public static void main(String[] args) {

		Person p1 = new Person("Mono", 25, 175, 60);
		BMI bmi1 = new BMI(p1);
		Person p2 = new Person("Java", 36, 165, 70);
		BMI bmi2 = new BMI(p2);
		System.out.println(bmi1);
		System.out.println(bmi2);

	}

}
