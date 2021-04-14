package com.viral.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viral.product.model.Cart;

@Repository
public interface ICartRepo extends JpaRepository<Cart, Long>{

}
