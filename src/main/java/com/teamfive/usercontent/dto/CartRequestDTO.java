package com.teamfive.usercontent.dto;

public class CartRequestDTO {

    private String token;
    private MiniProductDTO product;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public MiniProductDTO getProduct() {
        return product;
    }

    public void setProduct(MiniProductDTO product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartRequestDTO{" +
                "token='" + token + '\'' +
                ", product=" + product +
                '}';
    }
}
