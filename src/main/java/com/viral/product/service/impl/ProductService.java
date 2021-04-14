package com.viral.product.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.viral.product.dao.ProductRepo;
import com.viral.product.model.Category;
import com.viral.product.model.GenericSearchFilter;
import com.viral.product.model.Product;
import com.viral.product.model.SubCategory;
import com.viral.product.service.IProductService;
import com.viral.product.specification.ProductSpecification;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepo productRepo;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Page<Product> findProductsByGenericSearch(GenericSearchFilter search, Pageable pageable) {

		StringBuilder queryBuilder = new StringBuilder("select * from product p, category c where p.CAT_ID_FK=c.CAT_ID");
		Float minPrice = null;
		Float maxPrice = null;
		String regional = null;
		String service= null;
		String purpose = null;
		String type = null;
		Category category = null;
		SubCategory subCategory = null;
		if(!ObjectUtils.isEmpty(search)) {
			minPrice = search.getMinPrice();
			maxPrice = search.getMaxPrice();
			regional = search.getRegional();
			service = search.getService();
			purpose = search.getPurpose();
			type = search.getType();
			category = search.getCategory();
			subCategory = search.getSubCategory();
			if(minPrice != null && maxPrice != null) {
				queryBuilder.append(" and p.SELL_PRICE between "+minPrice+" and "+maxPrice);
			}
			if(!StringUtils.isEmpty(regional)) {
				queryBuilder.append(" and p.REGIONAL='"+regional+"'");
			}
			if(!StringUtils.isEmpty(service)) {
				queryBuilder.append(" and p.SERVICE='"+service+"'");
			}
		}
		log.debug("Inside @method findProductsByGenericSearch : Query : "+queryBuilder);
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(queryBuilder.toString());
		log.debug("queryForList :: "+Arrays.asList(queryForList));
		Page<Product> pageObj = productRepo.findAll(new ProductSpecification(null, null, null, minPrice, maxPrice, service, type, regional, purpose, category.getCatName(), subCategory.getSubCatName()), pageable);
		System.out.println("Page Obj : "+pageObj);
		//		return queryForList;
		return pageObj;
	}

	@Override
	public List<Product> findByProdCategory(String category) {
		System.out.println("Category : "+category);
		return productRepo.findProductsByCategory(category);
	}
	
	@Override
	public Product findByProdId(Long prodId) {
		return productRepo.findById(prodId).get();
	}

	@Override
	public List<Product> findProducts() {
		return null;
	}

	@Override
	public List<Product> findProductByFilter(Product product) {
		return null;
	}


}
