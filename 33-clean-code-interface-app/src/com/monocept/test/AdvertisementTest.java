package com.monocept.test;

import com.monocept.model.*;

public class AdvertisementTest {

	public static void main(String[] args) {
		Projector projector = new Projector();

		projector.display();

		Billboard bill = new Billboard();
		Adverstisement adv1 = new Adverstisement(bill);
		adv1.showAdvertisement();

		Monitor mon = new Monitor();
		Adverstisement adv2 = new Adverstisement(mon);
		adv2.showAdvertisement();

	}

}
