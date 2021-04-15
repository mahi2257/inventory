package com.viral.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.viral.inventory.model.SubCategory;

@Repository
public interface ISubCategoryRepo extends JpaRepository<SubCategory, Long>{
	
	@Query(value = "select * from subCategory sc, category c where c.CAT_ID=sc.SUB_CAT_ID and sc.STATUS=1 and c.CAT_ID_FK = ?1", nativeQuery = true)
	public List<SubCategory> findAllActiveSubCatByCatId(Long catId);

}
