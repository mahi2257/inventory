package com.viral.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viral.inventory.model.SubCategory;

@Repository
public interface ISubCategoryRepo extends JpaRepository<SubCategory, Long>{
	
//	@Query(value = "select * from subCategory where CAT_ID_FK = ?1", nativeQuery = true)
//	public List<SubCategory> findByCatId(Long catId);

}
