package com.viral.inventory.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.viral.inventory.model.Product;
import com.viral.inventory.service.IInboundService;


@RestController
@RequestMapping("/inbound")
public class InboundRestController {

	@Autowired
	private IInboundService inboundService;
	
	@PostMapping("/postProduct")
	public Product postProduct(@RequestBody Product products) {
//		Log.info("Product creation :: ",products);
		System.out.println("Product is creating "+products);
		return inboundService.postProduct(products);
	}
	
	@GetMapping("/brand/model/{brand}/{model}")
	public List<Product> getProductsByBrandAndModel(@PathVariable String brand, @PathVariable String model){
		return inboundService.getProductsByBrandAndModel(brand, model);
	}
	

}
