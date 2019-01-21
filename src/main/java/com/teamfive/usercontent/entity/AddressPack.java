package com.teamfive.usercontent.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection=AddressPack.COLLECTION_NAME)
public class AddressPack {
    public static final String COLLECTION_NAME="addresspack";


    @Id
    private String token;
    private List<Address> addressList= new ArrayList();

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<Address> getAddressList(Address address) {
        return this.addressList;
    }

    public void setAddressList(Address addressList) {
        this.addressList.add(addressList);
    }

    @Override
    public String toString() {
        return "AddressPack{" +
                "token='" + token + '\'' +
                ", addressList=" + addressList +
                '}';
    }
}
