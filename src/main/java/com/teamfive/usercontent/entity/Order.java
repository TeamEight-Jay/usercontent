package com.teamfive.usercontent.entity;

import com.teamfive.usercontent.dto.OrderDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection=Order.COLLECTION_NAME)
public class Order {
    public static final String COLLECTION_NAME="order";
   @Id
   private String token;
   private List<OrderDTO> orders = new ArrayList<>();


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDTO> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Order{" +
                "token='" + token + '\'' +
                ", orders=" + orders +
                '}';
    }
}
