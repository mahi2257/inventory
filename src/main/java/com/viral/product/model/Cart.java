package com.viral.product.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6571227561214655482L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cartId_fk", columnDefinition = "INT")
	private Long cartId;
		
	@Column(name="PRICE")
	private float price;
	
	@Column(name="ACTUAL_PRICE")
	private float actualPrice;
	
	@Column(name="DIS_NAME")
	private float disPrice;	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="CART_ID")
	private List<CartItem> cartItem;

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
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

	public List<CartItem> getCartItem() {
		return cartItem;
	}

	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}

}
