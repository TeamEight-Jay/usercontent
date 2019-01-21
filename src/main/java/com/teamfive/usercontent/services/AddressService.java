package com.teamfive.usercontent.services;



import com.teamfive.usercontent.entity.Address;

public interface AddressService {
    public Address add(Address address);
    public Address select(String userId);
    public Address update(Address address);
    public void delete(String userId);
}