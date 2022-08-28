package com.monocept.model;

public class Invoice {
	private String id;
	private String description;
	private double amount;
	private float tax;
	private double discountPercentage;
	private double taxAmount;
	private double discountAmount;
	private double totalAmount;

	public double getTaxAmount() {
		return taxAmount;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

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
		this.taxAmount=calculateTax();
		this.discountAmount=calculateDiscount();
		this.totalAmount=calculateTotal();
	}

	private  double calculateTax() {
		return amount * (tax / 100);
	}

	private double calculateDiscount() {
		return amount * (discountPercentage / 100);
	}

	public double calculateTotal() {
		return amount + calculateTax() - calculateDiscount();
	}
	
	//Delagation
	
//	public void printInvoice(){
//		new Printer().printInvoice(this);
//	}

}
