package com.teamfive.usercontent.repository;


import com.teamfive.usercontent.entity.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address,String> {
    }

