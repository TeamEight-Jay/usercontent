package com.teamfive.usercontent.entity;

import com.teamfive.usercontent.dto.MiniProductDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashMap;

@Document(collection=Cart.COLLECTION_NAME)
public class Cart {
    public static final String COLLECTION_NAME="cart";


    @Id
    private String userId;

    private HashMap<String,MiniProductDTO> product = new HashMap<String, MiniProductDTO>() ;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public HashMap<String, MiniProductDTO> getProduct() {
        return product;
    }

    public void setProduct(HashMap<String, MiniProductDTO> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "token='" + userId + '\'' +
                ", product=" + product +
                '}';
    }
}

