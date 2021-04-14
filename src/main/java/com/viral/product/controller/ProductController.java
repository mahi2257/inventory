package com.viral.product.controller;

import java.util.Map;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import com.viral.product.model.Product;
import com.viral.product.service.IProductService;
import com.viral.product.model.GenericSearchFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {
	
	//viralBazaar.com
	
	@Autowired
	private IProductService productService;
	
	//this api used for generic search
	//we can use this api when we are finding all products based on category
	@GetMapping("/findProductsByFilter")
	public Page<Product> findProductsBySearch(@RequestBody GenericSearchFilter search,  Integer pageNumber, Integer pageSize){
		log.info("Inside @method findProductsBySearch");
		PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
		return productService.findProductsByGenericSearch(search, pageRequest);
	}
			
	@GetMapping("/findProductById/{prodId}")
	public Product findByProductd(@PathVariable Long prodId) {
		log.info("Inside @method findByProductd");
		return productService.findByProdId(prodId);
	}
	
	@GetMapping("/findProducts")
	public List<Product> findProducts(){
		log.info("Inside @method findProducts");
		return productService.findProducts();
	}
	
}