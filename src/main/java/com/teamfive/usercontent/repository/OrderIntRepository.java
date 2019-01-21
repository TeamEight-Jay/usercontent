package com.teamfive.usercontent.repository;

import com.teamfive.usercontent.entity.MiniProduct;
import com.teamfive.usercontent.entity.OrderInt;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderIntRepository  extends MongoRepository<OrderInt,String> {

}
