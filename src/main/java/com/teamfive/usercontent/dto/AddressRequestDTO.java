package com.teamfive.usercontent.dto;

public class AddressRequestDTO {
    private String token;
    private String address;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressRequestDTO{" +
                "token='" + token + '\'' +
                ", address=" + address +
                '}';
    }
}
