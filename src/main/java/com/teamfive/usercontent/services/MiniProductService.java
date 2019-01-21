package com.teamfive.usercontent.services;

import com.teamfive.usercontent.entity.MiniProduct;

public interface MiniProductService {

    public MiniProduct addMiniProduct(MiniProduct miniProduct);
    public MiniProduct getMiniProduct(String productId);
    public MiniProduct updateMiniProduct(MiniProduct miniProduct);
    public void deleteMiniProduct(String productId);
    public Iterable<MiniProduct> findAll();
}
