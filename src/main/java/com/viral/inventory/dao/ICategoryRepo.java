package com.viral.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.viral.inventory.model.Category;

@Repository
public interface ICategoryRepo extends JpaRepository<Category, Long>{
	
	@Query(value = "select * from category where STATUS=1", nativeQuery=true)
	public List<Category> findAllActiveCategory();

}
