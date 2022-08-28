package com.monocept.person;

public class BMI {
	private double bmi;
	private Person person;

	public BMI(Person person) {
		this.person = person;
		bmi = calculateBMI();
	}

	private double calculateBMI() {
		double height = person.getHeight();
		int weight = person.getWeight();
		height = Math.pow(height / 100, 2);
		bmi = weight / height;
		return bmi;
	}

	public String bodyType() {
		if (bmi < 18.5) {
			return "Under Weight";
		}
		if (bmi >= 18.5 && bmi <= 24.99) {
			return "Normal range";
		}
		if (bmi >= 25 && bmi <= 30) {
			return "Normal range";
		}
		return "Obese";
	}

	public double getBMI() {
		return bmi;
	}

	@Override
	public String toString() {
		return "BMI [bmi=" + bmi + ", person=" + person + ", bodyType()=" + bodyType() + "]";
	}

}
