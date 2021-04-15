package com.viral.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.viral.inventory.dao.ICategoryRepo;
import com.viral.inventory.dao.ISubCategoryRepo;
import com.viral.inventory.model.Category;
import com.viral.inventory.model.SubCategory;
import com.viral.inventory.service.ICategoryService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private ICategoryRepo iCategoryRepo;

	@Autowired
	private ISubCategoryRepo isubCategoryRepo;

	
	@Override
	public Category addNewCategory(Category category){
		log.info("category Id in service : "+category.getCatId());
		log.info("new category in service : "+category);
		return iCategoryRepo.save(category);
	}

	@Override
	public SubCategory addNewSubCategory(SubCategory subCategory) {
		return isubCategoryRepo.save(subCategory);
	}
	
	@Override
	public List<Category> getCategories() {
		return iCategoryRepo.findAllActiveCategory();
	}

	@Override
	public List<SubCategory> getSubCategorysByCategoryId(Long catId) {
		List<SubCategory> subCategoryList = isubCategoryRepo.findAllActiveSubCatByCatId(catId);
		if(!ObjectUtils.isEmpty(subCategoryList)) {
			return subCategoryList;
		}
		return null;
	}

	@Override
	public String inactiveCategory(Long catId) {
		Optional<Category> category = iCategoryRepo.findById(catId);
		if(category.isPresent()) {
			Category categoryDtls = category.get();
			categoryDtls.setCategoryStatus(0);
			iCategoryRepo.save(categoryDtls);
			return "category has been inactive";
		}
		return null;
	}

	@Override
	public String inactiveSubCategory(Long subCatId) {
		Optional<SubCategory> subCategory = isubCategoryRepo.findById(subCatId);
		if(subCategory.isPresent()) {
			SubCategory subCategoryDtls = subCategory.get();
			subCategoryDtls.setSubCategoryStatus(0);
			isubCategoryRepo.save(subCategoryDtls);
			return "sub category has been inactive";
		}
		return null;
	}
	
}
