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
import com.viral.inventory.service.impl.InboundService;

@RestController
@RequestMapping("category")
public class CateoryRestController {
	
	@Autowired
	private InboundService inboundService;
	
	@PostMapping("/newCategory")
	public Category addNewCategory(@RequestBody Category newCategory) {
		return inboundService.addNewCategory(newCategory);
	}
	
	@GetMapping("/category")
	public List<Category> getCategories(){
		return inboundService.getCategories();
	}
	
	@PostMapping("/newSubCategory")
	public SubCategory addNewSubCategory(@RequestBody SubCategory subCategory){
		return inboundService.addNewSubCategory(subCategory);
	}
	
	@GetMapping("/subCategoryByCatName/{catId}")
	public List<SubCategory> getSubCategorysByCatName(@PathVariable Long catId){
		return inboundService.getSubCategorysByCategory(catId);
	}
	
}
