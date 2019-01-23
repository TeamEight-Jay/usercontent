package com.teamfive.usercontent.services;

import com.teamfive.usercontent.entity.Order;

public interface OrderService {
    public Order addOrder(Order order);
    public Order getOrder(String token);
    public Order updateOrder(Order order);
    public void deleteOrder(String token);
    public Iterable<Order> findByToken(String token);

}
