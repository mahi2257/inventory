package com.viral.product.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1017626414667754762L;

	@Id
	@Column(name = "prodId", columnDefinition = "INT")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long prodId;
	
	@Column(name = "NAME")
	private String prodName;
	
	@Column(name = "BRAND")
	private String brand;
	
	@Column(name = "MODEL")
	private String model;
	
	@Column(name = "MARKET_PRICE")
	private float marketPrice;
	
	@Column(name = "SELL_PRICE")
	private float sell_Price;
	
	@Column(name = "DIS_PRICE")
	private float disPrice;
	
	@Column(name = "QUANTITY")
	private int productQuantity;
	
	@Column(name = "MERCHANT_NAME")
	private String merchant;
	
	// Rent / Sell
	@Column(name = "SERVICE")
	private String service;
	
	// Golden / Silver / Artificial
	@Column(name = "TYPE")
	private String type;
	
	@Column(name = "REGIONAL")
	private String regional;
	
	// Marriage / Fashion / Casual
	@Column(name = "PURPOSE")
	private String purpose;
	
	@Column(name = "FEATURES")
	private String productSpecification;
	
	@OneToOne
	@JoinColumn(name = "POLICY_ID_FK")
	private Policies policies;	
	
	@OneToOne
	@JoinColumn(name = "CAT_ID_FK")
	private Category category;
	
	@OneToOne
	@JoinColumn(name = "SUB_CAT_ID_FK")
	private SubCategory subcategory;
	
	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(float marketPrice) {
		this.marketPrice = marketPrice;
	}

	public float getDisPrice() {
		return disPrice;
	}

	public void setDisPrice(float disPrice) {
		this.disPrice = disPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public SubCategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(SubCategory subcategory) {
		this.subcategory = subcategory;
	}

	public String getProductSpecification() {
		return productSpecification;
	}

	public void setProductSpecification(String productSpecification) {
		this.productSpecification = productSpecification;
	}

	public Policies getPolicies() {
		return policies;
	}

	public void setPolicies(Policies policies) {
		this.policies = policies;
	}
	
	public float getSell_Price() {
		return sell_Price;
	}

	public void setSell_Price(float sell_Price) {
		this.sell_Price = sell_Price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
}
