package com.teamfive.usercontent.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection=Order.COLLECTION_NAME)
public class Order {
    public static final String COLLECTION_NAME="order";
   @Id
   private String token;
    private List<OrderInt> orders = new ArrayList<>();

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<OrderInt> getOrders() {
        return this.orders;
    }

    public void setOrders(OrderInt orderInt) {
        this.orders.add(orderInt);
    }

    @Override
    public String toString() {
        return "Order{" +
                "token='" + token + '\'' +
                ", order=" + orders +
                '}';
    }
}
