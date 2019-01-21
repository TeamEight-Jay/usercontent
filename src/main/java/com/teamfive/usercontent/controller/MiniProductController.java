package com.teamfive.usercontent.controller;

import com.teamfive.usercontent.dto.MiniProductDTO;
import com.teamfive.usercontent.entity.MiniProduct;
import com.teamfive.usercontent.services.MiniProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MiniProductController {
    @Autowired
    MiniProductService miniProductService;
    @PostMapping("/addMiniProduct")
    public MiniProduct addMiniProduct(@RequestBody MiniProductDTO miniProductDTO)
    {
        MiniProduct miniProduct= new MiniProduct();
        BeanUtils.copyProperties(miniProductDTO, miniProduct);
        miniProductService.addMiniProduct(miniProduct);
        return  miniProduct;

    }


    @GetMapping("/selectMiniProduct")
    public MiniProduct getMiniProduct(@RequestParam String productId)
    {
        MiniProduct miniProduct=miniProductService.getMiniProduct(productId);
        System.out.println(miniProduct);
        return miniProduct;
    }

    @PutMapping("/updateMiniProduct")
    public MiniProduct updateMiniProduct(@RequestBody MiniProductDTO miniProductDTO)
    {
        MiniProduct miniProduct= new MiniProduct();
        BeanUtils.copyProperties(miniProductDTO, miniProduct);
        return miniProductService.updateMiniProduct(miniProduct);

    }

    @DeleteMapping("/deleteMiniProduct")
    public void deleteMiniProduct(@RequestParam String productId)
    {

        miniProductService.deleteMiniProduct(productId);
    }
}
