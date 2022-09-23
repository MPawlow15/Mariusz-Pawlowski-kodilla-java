package com.kodilla.good.patterns.practice1;

import com.kodilla.good.patterns.challenges.SaleRequest;

public class SupplierRequest {

    private User user;
    private int quantity;
    private String typeOfProduct;

    public SupplierRequest(User user, int quantity, String typeOfProduct) {
        this.user = user;
        this.quantity = quantity;
        this.typeOfProduct = typeOfProduct;
    }

    public User getUser() {
        return user;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }
}