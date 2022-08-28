package com.monocept.test;

import com.monocept.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice inv=new Invoice("123","Phone",500,10,15);
		
		inv.printInvoice();
	}

}
