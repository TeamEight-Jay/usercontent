package com.teamfive.usercontent.controller;

import com.teamfive.usercontent.dto.OrderDTO;
import com.teamfive.usercontent.entity.Order;
import com.teamfive.usercontent.services.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/add")
    public Order addOrder(@RequestBody OrderDTO orderDTO)
    {
        Order ordernew= getOrder(orderDTO.getToken());
      if(ordernew==null) ordernew=new Order();
//        order.setToken(orderDTO.getToken());
//        order.setOrders(orderDTO.getOrderInt());
//    Order ordernew= new Order();
    ordernew.setOrders(orderDTO.getOrderInt());
    ordernew.setToken(orderDTO.getToken());
        return orderService.updateOrder(ordernew);
    }
    @RequestMapping("/select")
    public Order getOrder(@RequestParam String token)
    {

        Order order=orderService.getOrder(token);

        return order;
    }
    @PutMapping("/update")
    public  Order updateOrder(@RequestBody OrderDTO orderDTO)
    {
        Order order= new Order();
        BeanUtils.copyProperties(orderDTO,order);
        return orderService.updateOrder(order);
    }
    @DeleteMapping("/delete")
    public void deleteOrder(@RequestParam String token){
        orderService.deleteOrder(token);

    }
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Iterable<Order> findByToken(String token)
    {

        return orderService.findByToken(token);
    }
}
