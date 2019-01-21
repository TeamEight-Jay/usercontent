package com.teamfive.usercontent.services;

import com.teamfive.usercontent.entity.Address;
import com.teamfive.usercontent.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class AddressServiceImplementation implements AddressService{
    @Autowired
    AddressRepository addressRepository;

    @Override
    public Address add(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address select(String userId) {
        return addressRepository.findOne(userId);
    }

    @Override
    public Address update(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void delete(String userId) {
        addressRepository.delete(userId);
    }
}