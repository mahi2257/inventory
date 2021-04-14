package com.viral.product.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.viral.product.dao.ICartRepo;
import com.viral.product.dao.ProductRepo;
import com.viral.product.model.Cart;
import com.viral.product.model.CartItem;
import com.viral.product.model.Product;
import com.viral.product.service.ICartService;

@Service
public class CartService implements ICartService{
	
	@Autowired
	private ICartRepo cartRepo;
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Boolean addProductToCart(Cart cart) {
		Cart saveCart = cartRepo.save(cart);
		if(!ObjectUtils.isEmpty(saveCart)) {
			return true;
		}
		return false;
	}

	@Override
	public void removeProductFromCart(Long cartId, Long cartItemId) {
		Optional<Cart> cartDtls = cartRepo.findById(cartId);
		if(cartDtls.isPresent()) {
			Cart cart = cartDtls.get();
			List<CartItem> cartItem = cart.getCartItem();
			if(!ObjectUtils.isEmpty(cartItem)) {
				cartItem.remove(cartItemId.intValue());
				cartRepo.save(cart);
			}
		}
	}

	@Override
	public Cart viewAllProductInCart(Long userId) {
		Optional<Cart> findAllCartProducts = cartRepo.findById(userId);
		if(findAllCartProducts.isPresent()) {
			Cart cart = findAllCartProducts.get();
			return cart;
		}
		return null;
	}

	@Override
	public Product viewProductFromCart(Long productId) {
		Optional<Product> productDtls = productRepo.findById(productId);
		if(productDtls.isPresent()) {
			Product product = productDtls.get();
			return product;
		}
		return null;
	}


}
