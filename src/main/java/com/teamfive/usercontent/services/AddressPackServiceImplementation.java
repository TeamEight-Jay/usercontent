package com.teamfive.usercontent.services;

import com.teamfive.usercontent.entity.AddressPack;
import com.teamfive.usercontent.repository.AddressPackRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class AddressPackServiceImplementation implements AddressPackService {
@Autowired
    AddressPackRepositroy addressPackRepositroy;
    @Override
    public AddressPack addAddressPack(AddressPack addressPack) {
        return addressPackRepositroy.save(addressPack);
    }

    @Override
    public AddressPack updateAddressPack(AddressPack addressPack) {
        return addressPackRepositroy.save(addressPack);
    }

    @Override
    public void deleteAddressPack(String token) {
addressPackRepositroy.delete(token);
    }

    @Override
    public AddressPack findByToken(String token) {
        AddressPack addressPacks=addressPackRepositroy.findByToken(token);
        return addressPacks;
    }
}
