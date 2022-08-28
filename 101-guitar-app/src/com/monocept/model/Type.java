package com.monocept.model;

public enum Type {
	Acoustic, Electric;

	@Override
	public String toString() {
		switch (this) {
		case Acoustic:
			return "Acoustic";

		case Electric:
			return "Electric";

		default:
			return null;

		}
	}
}
