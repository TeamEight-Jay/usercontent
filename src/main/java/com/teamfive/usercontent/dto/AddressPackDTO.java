package com.teamfive.usercontent.dto;

import java.util.ArrayList;
import java.util.List;

public class AddressPackDTO {

    private String token;
    private List<String> addressList= new ArrayList<String>();

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "AddressPackDTO{" +
                "token='" + token + '\'' +
                ", addressList=" + addressList +
                '}';
    }
}
