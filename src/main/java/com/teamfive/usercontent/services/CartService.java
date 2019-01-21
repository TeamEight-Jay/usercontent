package com.teamfive.usercontent.services;

import com.teamfive.usercontent.dto.CartDTO;
import com.teamfive.usercontent.entity.Cart;

public interface CartService {
    public Cart addCart(Cart cart);
    public Cart getCart(String token);
    public Cart updateCart(Cart cartId);
    public void deleteCart(String token);
public Iterable<Cart> findByToken(String token);

}
