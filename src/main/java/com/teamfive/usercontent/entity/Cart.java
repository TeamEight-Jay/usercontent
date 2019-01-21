package com.teamfive.usercontent.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection=Cart.COLLECTION_NAME)
public class Cart {
    public static final String COLLECTION_NAME="cart";


    @Id
    private String token;
    private List<MiniProduct> product = new ArrayList() ;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<MiniProduct> getProduct(MiniProduct product) {
        return this.product;
    }

    public void setProduct(MiniProduct product) {
        this.product.add(product);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "token='" + token + '\'' +
                ", product=" + product +
                '}';
    }
}

