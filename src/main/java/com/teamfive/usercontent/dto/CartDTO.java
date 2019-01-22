package com.teamfive.usercontent.dto;

import com.teamfive.usercontent.entity.MiniProduct;

import java.util.ArrayList;
import java.util.List;

public class CartDTO {
    private String token;
    private MiniProductDTO product;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public MiniProductDTO getProduct() {
        return product;
    }

    public void setProduct(MiniProductDTO product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "token='" + token + '\'' +
                ", product=" + product +
                '}';
    }
}
