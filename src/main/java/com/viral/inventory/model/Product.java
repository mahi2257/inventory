package com.viral.inventory.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "product")
@Setter
@Getter
@ToString
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
	
	// Marriage / Fashion / Casual
	@Column(name = "PURPOSE")
	private String purpose;

	// Marathi / Rajesthani 
	@Column(name = "REGIONAL")
	private String regional;

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

	
}
