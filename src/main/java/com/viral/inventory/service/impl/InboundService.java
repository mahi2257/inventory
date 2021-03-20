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

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InboundService implements IInboundService {

	@Autowired
	private IInboundRepo inboundRepo;
	
	@Autowired
	private ICategoryRepo iCategoryRepo;

	@Autowired
	private ISubCategoryRepo isubCategoryRepo;

	@Override
	public Product postProduct(Product products) {
		log.info("New Product adding into inventory : "+products);
		Long catId = products.getCategory().getCatId();
		log.info("New Product adding into inventory : catId : "+catId);
		Long subCatId = products.getSubcategory().getSubCatId();
		log.info("New Product adding into inventory : subCatId : "+subCatId);
		Optional<Category> category = iCategoryRepo.findById(catId);
		log.info("New Product adding into inventory : category Optional : "+category);
		Optional<SubCategory> subCategory = isubCategoryRepo.findById(subCatId);
		log.info("New Product adding into inventory : subCategory Optional : "+subCategory);
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
		log.info("category Id in service : "+category.getCatId());
		log.info("new category in service : "+category);
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
