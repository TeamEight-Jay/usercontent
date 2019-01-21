package com.teamfive.usercontent.dto;

import com.teamfive.usercontent.entity.Address;

public class AddressPackDTO {
    private String token;
    private Address address;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressPackDTO{" +
                "token='" + token + '\'' +
                ", address=" + address +
                '}';
    }
}
