package com.viral.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.viral.product.model.Product;

@Repository
//public interface ProductRepo extends JpaRepository<Product, Long>{
public interface ProductRepo extends PagingAndSortingRepository<Product, Long>, JpaSpecificationExecutor<Product> {

	@Query(value = "select * from product p, category c where p.CAT_ID_FK=c.CAT_ID and c.NAME=?1",nativeQuery = true)
	public List<Product> findProductsByCategory(String category);
	
	@Query(value = "select * from product p, category c where p.CAT_ID_FK=c.CAT_ID and p.SELL_PRICE between :startPrice AND :endPrice", nativeQuery = true)
	public List<Product> findProductsByGenericSearch(@Param("startPrice") float priceFrom, @Param("endPrice") float priceTo);
}
