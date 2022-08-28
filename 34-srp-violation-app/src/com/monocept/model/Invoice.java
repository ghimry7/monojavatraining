package com.monocept.model;

public class Invoice {
	private String id;
	private String description;
	private double amount;
	private float tax;
	private double discountPercentage;

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public float getTax() {
		return tax;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public Invoice(String id, String description, double amount, float tax, double discountPercentage) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercentage = discountPercentage;
	}

	private double calculateTax() {
		return amount * (tax / 100);
	}

	private double calculateDiscount() {
		return amount * (discountPercentage / 100);
	}

	public double calculateTotal() {
		return amount + calculateTax() - calculateDiscount();
	}

	public void printInvoice() {
		System.out.println("Id: "+id);
		System.out.println("Description: "+description);
		System.out.println("Amount: "+amount);
		System.out.println("Tax: "+tax);
		System.out.println("Discount: "+discountPercentage);
		System.out.println("Total Invoice: %f" + calculateTotal());
	}

}
