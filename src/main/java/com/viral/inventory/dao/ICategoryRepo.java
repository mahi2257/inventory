package com.viral.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viral.inventory.model.Category;

@Repository
public interface ICategoryRepo extends JpaRepository<Category, Long>{

}
