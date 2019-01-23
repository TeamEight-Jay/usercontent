package com.teamfive.usercontent.dto;

import com.teamfive.usercontent.entity.Address;

public class OrderIntDTO {
    private String orderId;
    private MiniProductDTO miniProduct;
    private String merchantId;
    private String price;
    private String modeOfPayment;
    private Address address;
    private String date;
    private String userId;
    private String review;
    private String status;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public MiniProductDTO getMiniProduct() {
        return miniProduct;
    }

    public void setMiniProduct(MiniProductDTO miniProduct) {
        this.miniProduct = miniProduct;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderIntDTO{" +
                "orderId='" + orderId + '\'' +
                ", miniProduct=" + miniProduct +
                ", merchantId='" + merchantId + '\'' +
                ", price='" + price + '\'' +
                ", modeOfPayment='" + modeOfPayment + '\'' +
                ", address=" + address +
                ", date='" + date + '\'' +
                ", userId='" + userId + '\'' +
                ", review='" + review + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
