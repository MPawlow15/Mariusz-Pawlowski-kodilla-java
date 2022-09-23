package com.kodilla.good.patterns.practice1;

public class SupplierDate {
    public SupplierRequest delivery() {
        User user = new User("John", "Wick");
        int quantity = 5;
        String typeOfProduct = "apple";

        return new SupplierRequest(user, quantity, typeOfProduct);
    }
}
