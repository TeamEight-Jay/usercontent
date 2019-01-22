package com.teamfive.usercontent.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
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

    private ArrayList<MiniProduct> product = new ArrayList<MiniProduct>() ;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ArrayList<MiniProduct> getProduct() {
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

