package com.teamfive.usercontent.repository;

import com.teamfive.usercontent.entity.AddressPack;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressPackRepositroy extends MongoRepository<AddressPack,String> {
    public AddressPack findByToken(String token);
}
