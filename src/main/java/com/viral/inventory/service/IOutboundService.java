package com.viral.inventory.service;

import com.viral.inventory.model.Invoice;
import com.viral.inventory.model.Product;

public interface IOutboundService {

	//we might pass product id also becouse we will simply decrease quantity 
	public Product saleProduct(Product product);
	
	public Invoice getCustomerInvoice();
	
}
