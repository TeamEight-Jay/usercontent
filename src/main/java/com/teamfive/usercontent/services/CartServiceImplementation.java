package com.teamfive.usercontent.services;

import com.teamfive.usercontent.dto.CartDTO;
import com.teamfive.usercontent.dto.MiniProductDTO;
import com.teamfive.usercontent.entity.Cart;
import com.teamfive.usercontent.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.HashMap;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class CartServiceImplementation implements CartService {
    @Autowired
    CartRepository cartRepository;

    public CartDTO convertToDTO(Cart cart)
    {
        CartDTO cartDTO=new CartDTO();
        cartDTO.setUserId(cart.getUserId());
        cartDTO.setProduct(new ArrayList<MiniProductDTO>(cart.getProduct().values()));
        return cartDTO;
    }

    public Cart convertToEntity(CartDTO cartDTO)
    {
        Cart cart=new Cart();
        cart.setUserId(cartDTO.getUserId());
        for(MiniProductDTO miniProductDTO:cartDTO.getProduct())
        {
            cart.getProduct().put(miniProductDTO.getInventoryId(),miniProductDTO);
        }
        return cart;
    }


    @Override
    public CartDTO createCart(String userId) {
        Cart cart=new Cart();
        if(check(userId)==true) return getCart(userId);
        cart.setUserId(userId);
        cart.setProduct(new HashMap<String,MiniProductDTO>());
        Cart insertedCart=cartRepository.save(cart);
        return convertToDTO(insertedCart);
    }

    @Override
    public CartDTO getCart(String userId) {
        Cart cart=cartRepository.findOne(userId);
        if(cart==null) return createCart(userId);
        return convertToDTO(cart);
    }

    @Override
    public void deleteCart(String userId) {
        cartRepository.delete(userId);
    }

    @Override
    public void addItem(String userId, MiniProductDTO miniProductDTO) {
        Cart cart=cartRepository.findOne(userId);
        if(cart==null)
        {
            createCart(userId);
            cart=cartRepository.findOne(userId);
        }
        String key=miniProductDTO.getInventoryId();
        if(cart.getProduct().containsKey(key))
        {
            MiniProductDTO miniProductDTOInMap=cart.getProduct().get(key);
            miniProductDTOInMap.setQuantity(Math.max(0,miniProductDTO.getQuantity()+miniProductDTOInMap.getQuantity()));
            miniProductDTOInMap.setPrice(miniProductDTO.getPrice());
            cart.getProduct().put(key,miniProductDTOInMap);
        }
        else{
            cart.getProduct().put(key,miniProductDTO);
        }
        cartRepository.delete(userId);
        cartRepository.save(cart);
    }

    @Override
    public void deleteItem(String userId, String inventoryId) {
        Cart cart=cartRepository.findOne(userId);
        cart.getProduct().remove(inventoryId);
        cartRepository.delete(cart.getUserId());
        cartRepository.save(cart);
    }

    @Override
    public boolean check(String userId) {
        return cartRepository.exists(userId);
    }
}
