package com.monocept.circle;

public class Circle {
	private int radius;
	private CircleColor color;
	private float area;
	private final static float pi = (float)3.14;

	public Circle(int radius, CircleColor color) {
		super();
		this.radius = radius;
		this.color = color;
		area();
	}

	public int getRadius() {
		return radius;
	}

	public CircleColor getColor() {
		return color;
	}

	public void area() {
		area = pi * radius * radius;

	}

	@Override
	public String toString() {
		return "radius: "+radius+", color: "+color+", area: "+area;
	}

}
