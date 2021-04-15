package com.viral.inventory.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.viral.inventory.model.Category;
import com.viral.inventory.model.SubCategory;
import com.viral.inventory.service.ICategoryService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("category")
public class CateoryRestController {
	
	@Autowired
	private ICategoryService categoryService;
	
	@PostMapping("/newCategory")
	public Category addNewCategory(@RequestBody Category newCategory) {
		log.info("new Category rest controller ");
		log.info("New Category cat Id : "+newCategory.getCatId());
		log.info("New Category cat Name : "+newCategory.getCatName());
		log.info("New Category cat status : "+newCategory.getCategoryStatus());
		return categoryService.addNewCategory(newCategory);
	}
	
	@PostMapping("/newSubCategory")
	public SubCategory addNewSubCategory(@RequestBody SubCategory subCategory){
		return categoryService.addNewSubCategory(subCategory);
	}
	
	@GetMapping("/findAllCategories")
	public List<Category> getCategories(){
		return categoryService.getCategories();
	}
	
	@GetMapping("/findAllSubCategoriesByCatId/{catId}")
	public List<SubCategory> getSubCategorysByCatName(@PathVariable Long catId){
		return categoryService.getSubCategorysByCategoryId(catId);
	}
	
	@GetMapping("/inactiveCategory/{catId}")
	public String inactiveCategory(@PathVariable Long catId){
		return categoryService.inactiveCategory(catId);
	}
	
	@GetMapping("/inactiveSubCategory/{subCatId}")
	public String inactiveSubCategory(@PathVariable Long subCatId){
		return categoryService.inactiveSubCategory(subCatId);
	}
	
}
