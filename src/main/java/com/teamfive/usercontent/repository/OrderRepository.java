package com.teamfive.usercontent.repository;

import com.teamfive.usercontent.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository  extends MongoRepository<Order,String> {
    Iterable<Order> findByToken(String token);
}
