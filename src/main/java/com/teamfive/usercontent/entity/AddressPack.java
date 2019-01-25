package com.teamfive.usercontent.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document(collection=AddressPack.COLLECTION_NAME)
public class AddressPack implements Serializable {
    public static final String COLLECTION_NAME="address";


    @Id
    private String token;
    private List<String> addressList= new ArrayList<String>();

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<String> getAddressList() {
        return this.addressList;
    }

    public void setAddressList(String addressList) {
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
