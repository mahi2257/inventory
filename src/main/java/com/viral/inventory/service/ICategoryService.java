package com.viral.inventory.service;

import java.util.List;

import com.viral.inventory.model.Category;
import com.viral.inventory.model.SubCategory;

public interface ICategoryService {

	public Category addNewCategory(Category category);
	
	public SubCategory addNewSubCategory(SubCategory subCategory);

	public List<Category> getCategories();
	
	public List<SubCategory> getSubCategorysByCategoryId(Long catId);
	
	public String inactiveCategory(Long catId);
	
	public String inactiveSubCategory(Long catId);

}
