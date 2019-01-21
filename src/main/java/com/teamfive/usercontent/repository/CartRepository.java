package com.teamfive.usercontent.repository;

import com.teamfive.usercontent.entity.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart,String> {
    public Iterable<Cart> findByToken(String token);
}
