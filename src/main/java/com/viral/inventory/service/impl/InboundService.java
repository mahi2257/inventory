package com.viral.inventory.service.impl;

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

@Slf4j
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

}
