package com.teamfive.usercontent.entity;

import com.teamfive.usercontent.dto.MiniProductDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = OrderInt.COLLECTION_NAME)
public class OrderInt {

    public static final String COLLECTION_NAME="orderInt";
    @Id
    private String orderId;
    private MiniProductDTO miniProduct;
    private String merchantId;
    private String price;
    private String modeOfPayment;
    private Address address;
    private String date;
    private String userId;
    private float rating;
    private String status;
    private String quantity;


    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "OrderInt{" +
                "orderId='" + orderId + '\'' +
                ", miniProduct=" + miniProduct +
                ", merchantId='" + merchantId + '\'' +
                ", price='" + price + '\'' +
                ", modeOfPayment='" + modeOfPayment + '\'' +
                ", address=" + address +
                ", date='" + date + '\'' +
                ", userId='" + userId + '\'' +
                ", rating=" + rating +
                ", status='" + status + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
