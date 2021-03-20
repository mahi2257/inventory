package com.viral.inventory.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.viral.inventory.model.Category;
import com.viral.inventory.model.Product;
import com.viral.inventory.model.SubCategory;


public interface IInboundService {
	
	public Product postProduct(Product products);
	
	public List<Product> getProductsByBrandAndModel(String brand, String model);
	
	public Category addNewCategory(Category category);
	
	public List<Category> getCategories();
	
	public SubCategory getSubCategorysByCategory(Long catId);
	
	public SubCategory addNewSubCategory(SubCategory subCategory);
	
	//will create invoice model and retrurn 
	public void getVendorInvoice();
	
	//(Good Receive Note)
	public void getGRN();
}
