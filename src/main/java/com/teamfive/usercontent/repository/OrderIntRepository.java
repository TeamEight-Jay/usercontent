package com.teamfive.usercontent.repository;

import com.teamfive.usercontent.entity.OrderInt;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderIntRepository  extends MongoRepository<OrderInt,String> {

}
