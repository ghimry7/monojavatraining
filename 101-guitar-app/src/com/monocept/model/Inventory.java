package com.monocept.model;

import java.util.*;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		GuitarSpec spec = new GuitarSpec(builder, model, type, backWood, topWood);
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List<Guitar> search(GuitarSpec spec) {
		List<Guitar> foundGuitar = new LinkedList<>();
		for (Guitar guitar : guitars) {
			if (guitar.getSpec().matches(spec)) {
				foundGuitar.add(guitar);
			}
		}
		return foundGuitar;
	}

}
