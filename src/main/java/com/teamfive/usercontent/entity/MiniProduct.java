package com.teamfive.usercontent.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = MiniProduct.COLLECTION_NAME)
public class MiniProduct {
    public static final String COLLECTION_NAME="miniProduct";
    @Id
    private String productId;
    private String productName;
    private String imageUrl;
    private Integer productRating;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getProductRating() {
        return productRating;
    }

    public void setProductRating(Integer productRating) {
        this.productRating = productRating;
    }

    @Override
    public String toString() {
        return "MiniProduct{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", productRating=" + productRating +
                '}';
    }
}
