package com.viral.product.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.viral.product.model.Product;

@Component
public class ProductSpecification implements Specification<Product>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2729196931192567919L;
	
	private String prodName;	
	private String brand;
	private String model;
	private float minPrice;
	private float maxPrice;
	// Rent / Sell
	private String service;
	// Golden / Silver / Artificial
	private String type;
	//Hyderabadi/Marathi/Odisa/Gujrati/Rajeshthani
	private String regional;
	// Marriage / Fashion / Casual
	private String purpose;
	private String category;
	private String subcategory;

	public ProductSpecification(String prodName, String brand, String model, float minPrice, float maxPrice, String service, String type, String regional, String purpose, String category, String subCategory) {
		this.prodName = prodName;
		this.brand = brand;
		this.model = model;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.service = service;
		this.type = type;
		this.regional = regional;
		this.purpose = purpose;
		this.category = category;
		this.subcategory = subCategory;
	}
	
	@Override
	public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		return null;
	}

	
}
