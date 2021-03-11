package com.viral.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viral.inventory.model.Product;

@Repository
public interface IOutboundRepo extends JpaRepository<Product, Long>{

}
