package com.monocept.model;

public enum Builder {
	Fender, Martin, Gibson, Collins, Olson, Ryan, Prs, Any;

	@Override
	public String toString() {
		switch (this) {
		case Fender:
			return "Fender";

		case Martin:
			return "Martin";

		case Gibson:
			return "Gibson";

		case Collins:
			return "Collins";

		case Olson:
			return "Olson";

		case Ryan:
			return "Ryan";

		case Prs:
			return "Prs";

		case Any:
			return "Any";

		default:
			return null;

		}
	}
}
