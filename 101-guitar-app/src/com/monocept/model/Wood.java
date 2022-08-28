package com.monocept.model;

public enum Wood {
	Indian_Rosewood, Brazilian_Rosewood, Maple, Cedar, Cocobold, Alder, Sitka, Mahogany;

	@Override
	public String toString() {
		switch (this) {
		case Indian_Rosewood:
			return "Indian_Rosewood";

		case Brazilian_Rosewood:
			return "Brazilian_Rosewood";

		case Maple:
			return "Maple";

		case Cedar:
			return "Cedar";

		case Cocobold:
			return "Cocobold";

		case Alder:
			return "Alder";

		case Sitka:
			return "Sitka";

		case Mahogany:
			return "Mahogany";

		default:
			return null;

		}
	}
}
