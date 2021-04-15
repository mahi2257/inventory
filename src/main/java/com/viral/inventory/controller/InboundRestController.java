package com.viral.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.viral.inventory.model.Product;
import com.viral.inventory.service.IInboundService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/inbound")
@Slf4j
public class InboundRestController {

	@Autowired
	private IInboundService inboundService;
	
	@PostMapping("/postProduct")
	public Product postProduct(@RequestBody Product products) {
		log.info("Inside @method postProduct");
		return inboundService.postProduct(products);
	}
	
	@GetMapping("/decreaseProductCount")
	public Product updateProduct() {
	
		return null;
	}

}