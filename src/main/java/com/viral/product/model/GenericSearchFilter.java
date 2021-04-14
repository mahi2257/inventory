package com.viral.product.model;

import lombok.Data;

@Data
public class GenericSearchFilter {
	
	private float minPrice;
	
	private float maxPrice;
	
	private String model;
	
	private String type;
	
	private String regional;
	
	private String purpose;
	
	private String service;
	
	private Category category;
	
	private SubCategory subCategory;

	
}
