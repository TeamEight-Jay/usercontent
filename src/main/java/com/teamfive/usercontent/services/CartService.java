package com.teamfive.usercontent.services;

import com.teamfive.usercontent.dto.CartDTO;
import com.teamfive.usercontent.dto.MiniProductDTO;

public interface CartService {
    public CartDTO createCart(String userId);
    public CartDTO getCart(String userId);
    public void deleteCart(String userId);
    public void addItem(String userId,MiniProductDTO miniProductDTO);
    public void deleteItem(String userId,String inventoryId);
    public boolean check(String userId);

}
