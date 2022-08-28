package com.monocept.model;

public class Printer {
	
	public void printInvoice(Invoice obj) {
		System.out.println("Id: " + obj.getId());
		System.out.println("Description: " + obj.getDescription());
		System.out.println("Amount: " + obj.getAmount());
		System.out.println("Tax: " + obj.getTaxAmount());
		System.out.println("Discount: " + obj.getDiscountAmount());
		System.out.println("Total Invoice: " + obj.getTotalAmount());
	}
}
