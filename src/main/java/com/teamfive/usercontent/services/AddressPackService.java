package com.teamfive.usercontent.services;

import com.teamfive.usercontent.entity.AddressPack;

public interface AddressPackService  {
    public AddressPack addAddressPack(AddressPack addressPack);
    public AddressPack getAddressPack(String token);
    public AddressPack updateAddressPack(AddressPack addressPack);
    public void deleteAddressPack(String token);
    public Iterable<AddressPack> findByToken(String token);
}
