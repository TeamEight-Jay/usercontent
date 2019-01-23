package com.teamfive.usercontent.dto;

import java.io.Serializable;

public class OrderRequestDTO implements Serializable {
    private String token;
    private OrderDTO order;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public OrderDTO getOrder() {
        return order;
    }

    public void setOrder(OrderDTO order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderRequestDTO{" +
                "token='" + token + '\'' +
                ", order=" + order +
                '}';
    }
}
