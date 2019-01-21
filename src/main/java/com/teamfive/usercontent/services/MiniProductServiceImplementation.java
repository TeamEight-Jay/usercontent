package com.teamfive.usercontent.services;

import com.teamfive.usercontent.entity.MiniProduct;
import com.teamfive.usercontent.repository.MiniProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class MiniProductServiceImplementation implements MiniProductService {

    @Autowired
    MiniProductRepository miniProductRepository;
    @Override
    @Transactional(readOnly = false)
    public MiniProduct addMiniProduct(MiniProduct miniProduct) {
        return miniProductRepository.save(miniProduct);
    }

    @Override
    public MiniProduct getMiniProduct(String productId) {
        MiniProduct miniProduct=miniProductRepository.findOne(productId);
        return miniProduct ;
    }

    @Override
    public MiniProduct updateMiniProduct(MiniProduct miniProduct) {
return miniProductRepository.save(miniProduct);
    }

    @Override
    public void deleteMiniProduct(String productId) {
 miniProductRepository.delete(productId);
    }

    @Override
    public Iterable<MiniProduct> findAll() {
        Iterable<MiniProduct> mini=findAll();
        return mini;
    }
}
