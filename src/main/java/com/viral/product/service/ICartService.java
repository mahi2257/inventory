package com.viral.product.service;

import com.viral.product.model.Cart;
import com.viral.product.model.Product;

public interface ICartService {

	public Boolean addProductToCart(Cart cart);
	
	public void removeProductFromCart(Long cartId, Long cartItemId);
	
	public Cart viewAllProductInCart(Long userId);
	
	public Product viewProductFromCart(Long productId);
		
}
