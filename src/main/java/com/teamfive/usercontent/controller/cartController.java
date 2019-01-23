package com.teamfive.usercontent.controller;

import com.teamfive.usercontent.dto.CartDTO;
import com.teamfive.usercontent.dto.CartRequestDTO;
import com.teamfive.usercontent.dto.MiniProductDTO;
import com.teamfive.usercontent.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/cart")
public class cartController {
    @Autowired
    CartService cartService;

    public String getUserIdFromToken(String token)
    {
        return token;
    }


    @PostMapping("/item/add")
    public CartDTO addItem(@RequestBody CartRequestDTO cartRequestDTO)
    {
        cartService.addItem(cartRequestDTO.getToken(),cartRequestDTO.getProduct());
        return cartService.getCart(cartRequestDTO.getToken());
    }

    @RequestMapping(value ="/create",method = RequestMethod.GET)
    public CartDTO createCart(@RequestParam String token)
    {
        String userId=getUserIdFromToken(token);
        return cartService.createCart(userId);
    }


    @RequestMapping(value ="/get",method = RequestMethod.GET)
    public CartDTO getCart(@RequestParam String token)
    {
        String userId=getUserIdFromToken(token);
        return cartService.getCart(userId);
    }
    @RequestMapping(value ="/item/delete",method = RequestMethod.DELETE)
    public void deleteItem(@RequestParam String token,@RequestParam String id)
    {
        String userId=getUserIdFromToken(token);
        cartService.deleteItem(userId,id);
    }

}
