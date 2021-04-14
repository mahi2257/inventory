package com.viral.product.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartItem")
public class CartItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6468490904234902764L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cartItemId_fk", columnDefinition = "INT")
	private Long cartItemId;
	
	@Column(name="PROD_NAME")
	private String productName;
	
	@Column(name="ACTUAL_PRICE")
	private float actualPrice;
	
	@Column(name="DIS_NAME")
	private float disPrice;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="PROD_SPEC")
	private String productSpecification;

	public Long getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(Long cartItemId) {
		this.cartItemId = cartItemId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(float actualPrice) {
		this.actualPrice = actualPrice;
	}

	public float getDisPrice() {
		return disPrice;
	}

	public void setDisPrice(float disPrice) {
		this.disPrice = disPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductSpecification() {
		return productSpecification;
	}

	public void setProductSpecification(String productSpecification) {
		this.productSpecification = productSpecification;
	}

}
