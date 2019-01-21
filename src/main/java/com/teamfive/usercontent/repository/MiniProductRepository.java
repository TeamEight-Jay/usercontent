package com.teamfive.usercontent.repository;

import com.teamfive.usercontent.entity.MiniProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MiniProductRepository extends MongoRepository<MiniProduct, String> {
List<MiniProduct> findAll();
}
