package com.teamfive.usercontent.dto;

import com.teamfive.usercontent.entity.OrderInt;

import java.io.Serializable;

public class OrderDTO implements Serializable {
    private String token;
    private OrderInt orderInt;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public OrderInt getOrderInt() {
        return orderInt;
    }

    public void setOrderInt(OrderInt orderInt) {
        this.orderInt = orderInt;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "token='" + token + '\'' +
                ", orderInt=" + orderInt +
                '}';
    }
}
