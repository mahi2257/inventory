package com.viral.inventory.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viral.inventory.dao.IOutboundRepo;
import com.viral.inventory.model.Invoice;
import com.viral.inventory.model.Product;
import com.viral.inventory.service.IOutboundService;

@Service
public class OutboundService implements IOutboundService{

	@Autowired
	IOutboundRepo iOutboundRepo;
	
	@Override
	public Product saleProduct(Product product) {
		Product saleProduct = iOutboundRepo.save(product);
		return saleProduct;
	}

	@Override
	public Invoice getCustomerInvoice() {
		return null;
	}

}
