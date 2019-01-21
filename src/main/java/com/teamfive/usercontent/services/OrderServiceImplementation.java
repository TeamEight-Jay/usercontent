package com.teamfive.usercontent.services;

import com.teamfive.usercontent.entity.Cart;
import com.teamfive.usercontent.entity.Order;
import com.teamfive.usercontent.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class OrderServiceImplementation implements OrderService {
@Autowired
    OrderRepository orderRepository;
    @Override
    public Order addOrder(Order order1) {
        return orderRepository.save(order1);
    }

    @Override
    public Order getOrder(String token) {
        Order order=orderRepository.findOne(token);
        System.out.println(order);
        return order;
    }

    @Override
    public Order updateOrder(Order order1) {
        return orderRepository.save(order1);
    }

    @Override
    public void deleteOrder(String token) {
       orderRepository.delete(token);

    }
    @Override
    public Iterable<Order> findByToken(String token)
    {
        Iterable<Order> orders=orderRepository.findByToken(token);
        return  orders;
    }

}
