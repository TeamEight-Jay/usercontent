package com.teamfive.usercontent.controller;

import com.teamfive.usercontent.dto.OrderDTO;
import com.teamfive.usercontent.dto.OrderRequestDTO;
import com.teamfive.usercontent.entity.Order;
import com.teamfive.usercontent.services.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/add")
    public Order addOrder(@RequestBody OrderRequestDTO orderRequestDTO)
    {
        Order order=orderService.getOrder(orderRequestDTO.getToken());
        if(order==null)
        {
            order=new Order();
            order.setToken(orderRequestDTO.getToken());
            order.setOrders(new ArrayList<OrderDTO>());
        }
        order.getOrders().add(orderRequestDTO.getOrder());
        orderService.updateOrder(order);
        return order;
    }


    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Iterable<Order> findByToken(@RequestParam  String token)
    {
        return orderService.findByToken(token);
    }
}
