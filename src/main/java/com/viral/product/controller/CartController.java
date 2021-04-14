package com.viral.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viral.product.model.Cart;
import com.viral.product.model.Product;
import com.viral.product.service.ICartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private ICartService cartService;
	
	@PostMapping("/addProductToCart")
	public Boolean addProductToCart(Cart cart) {
		return cartService.addProductToCart(cart);
	}
	
	@DeleteMapping("/removeProductFromCart")
	public String removeProductFromCart(Long cartId, Long cartItemId) {
		cartService.removeProductFromCart(cartId, cartItemId);
		return "Item removed from cart";
	}
	
	@GetMapping("/viewAllProductInCart")
	public Cart viewAllProductInCart(Long userId) {
		return cartService.viewAllProductInCart(userId);
	}
	
	@GetMapping("/viewProductFromCart")
	public Product viewProductFromCart(Long productId) {
		return cartService.viewProductFromCart(productId);
	}

	

}
