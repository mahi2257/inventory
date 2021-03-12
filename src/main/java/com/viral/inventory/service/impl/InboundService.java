package com.viral.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viral.inventory.dao.ICategoryRepo;
import com.viral.inventory.dao.IInboundRepo;
import com.viral.inventory.dao.ISubCategoryRepo;
import com.viral.inventory.model.Category;
import com.viral.inventory.model.Product;
import com.viral.inventory.model.SubCategory;
import com.viral.inventory.service.IInboundService;

@Service
public class InboundService implements IInboundService {

	@Autowired
	private IInboundRepo inboundRepo;
	
	@Autowired
	private ICategoryRepo iCategoryRepo;

	@Autowired
	private ISubCategoryRepo isubCategoryRepo;

	@Override
	public Product postProduct(Product products) {
		Long catId = products.getCategory().getCatId();
//		Log.info("catId : ",catId);
		Long subCatId = products.getSubcategory().getSubCatId();
//		Log.info("sub Cat Id : ",subCatId);
		Optional<Category> category = iCategoryRepo.findById(catId);
//		Log.info("category : ",category);
		Optional<SubCategory> subCategory = isubCategoryRepo.findById(subCatId);
//		Log.info("subCategory : ",subCategory);
		products.setSubcategory(subCategory.get());
		products.setCategory(category.get());
		return inboundRepo.save(products);
	}

	@Override
	public List<Product> getProductsByBrandAndModel(String brand, String model) {
		return inboundRepo.getProductsByBrandAndModel(brand, model);
	}
	
	@Override
	public Category addNewCategory(Category category){
		return iCategoryRepo.save(category);
	}

	@Override
	public List<Category> getCategories() {
		return null;
	}

	@Override
	public List<SubCategory> getSubCategorysByCategory(Long catId) {
		return isubCategoryRepo.findByCatId(catId);
	}
	
	@Override
	public SubCategory addNewSubCategory(SubCategory subCategory) {
		return isubCategoryRepo.save(subCategory);
	}

	@Override
	public void getVendorInvoice() {

	}

	@Override
	public void getGRN() {

	}


}
