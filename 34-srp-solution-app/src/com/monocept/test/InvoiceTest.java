package com.monocept.test;

import com.monocept.model.Invoice;
import com.monocept.model.Printer;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice inv=new Invoice("123","Phone",500,10,15);
		
//		inv.printInvoice(); //delegation
		
		Printer print=new Printer();
		print.printInvoice(inv);
	}

}
