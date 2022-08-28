package com.monocept.test;
import com.monocept.model.*;
public class Test {

	public static void main(String[] args) {
		Car c1=new Car(new PetrolEngine());
		c1.start();
		Car c2=new Car(new DieselEngine());
		c2.start();
	}

}
