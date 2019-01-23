package com.teamfive.usercontent.dto;

import java.util.ArrayList;

public class CartDTO {
    private String userId;
    private ArrayList<MiniProductDTO> product;



    @Override
    public String toString() {
        return "CartDTO{" +
                "token='" + userId + '\'' +
                ", product=" + product +
                '}';
    }



    public ArrayList<MiniProductDTO> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<MiniProductDTO> product) {
        this.product = product;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
