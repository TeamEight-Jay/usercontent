package com.teamfive.usercontent.controller;

import com.teamfive.usercontent.dto.CartDTO;
import com.teamfive.usercontent.entity.Cart;
import com.teamfive.usercontent.services.CartService;
import com.teamfive.usercontent.services.MiniProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/cart")
public class cartController {
    @Autowired
    CartService cartService;
    @Autowired
    MiniProductService miniProductService;

    @PostMapping("/add")
    public Cart addCart(@RequestBody CartDTO cartDTO)
   {

    Cart cart= getCart(cartDTO.getToken());
    if(cart==null) cart=new Cart();
    cart.setToken(cartDTO.getToken());
    cart.setProduct(cartDTO.getProduct());

//        Cart cart = new Cart();
//        Iterable<MiniProduct> products= (Iterable<MiniProduct>) cartDTO.getProduct();
//        MiniProduct product=new MiniProduct();
//        for(Object o: products)
//        {
//
//        }
//
//        product.setImageUrl(products.);
     // BeanUtils.copyProperties(cartDTO,cart);
//        cart.setCartId(cartDTO.getCartId());
//        cart.setProduct(miniProductService.findAll());
     cartService.updateCart(cart);
     return cart;
    }
    @RequestMapping(value ="/select",method = RequestMethod.GET)
    public Cart getCart(@RequestParam String token)
    {
        Cart cart=cartService.getCart(token);
        return cart;
    }
    @RequestMapping(value ="/update",method = RequestMethod.PUT)
    public Cart updateCart(@RequestBody CartDTO cartDTO)
    {
        Cart cart = new Cart();
       BeanUtils.copyProperties(cartDTO,cart);
//        cart.setCartId(cartDTO.getCartId());
//        cart.setProduct(miniProductService.findAll());
        return cartService.updateCart(cart);
    }
    @RequestMapping(value ="/delete",method = RequestMethod.DELETE)
    public void deleteCart(@RequestParam String token)
    {
        cartService.deleteCart(token);
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Iterable<Cart> findByToken(String token)
    {

        return cartService.findByToken(token);
    }
}
