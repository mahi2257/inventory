package com.viral.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viral.inventory.model.Product;

@Repository
public interface IInboundRepo extends JpaRepository<Product, Long>{
	
	public List<Product> getProductsByBrandAndModel(String brand, String model);
		

}
