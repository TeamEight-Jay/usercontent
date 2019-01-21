package com.teamfive.usercontent.services;

import com.teamfive.usercontent.entity.Cart;
import com.teamfive.usercontent.repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class CartServiceImplementation implements CartService {
@Autowired
CartRepository cartRepository;

    @Override
    public Cart addCart(Cart cart) {
       return cartRepository.save(cart);


    }

    @Override
    public Cart getCart(String token) {
        Cart cart = cartRepository.findOne(token);
        return cart;
    }

    @Override
    public Cart updateCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public void deleteCart(String token) {
cartRepository.delete(token);
    }
    @Override
    public Iterable<Cart> findByToken(String token){
        Iterable<Cart> cart=cartRepository.findByToken(token);
        System.out.println(cart);
    return cart;}
}
