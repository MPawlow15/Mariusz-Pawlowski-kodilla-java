package com.kodilla.good.patterns.practice1;

public class Application {
    public static void main(String[] args) {
        SupplierDate supplierDate = new SupplierDate();
        SupplierRequest supplierRequest = supplierDate.delivery();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.process(supplierRequest);

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.process(supplierRequest);

        HealthyShop healthyShop = new HealthyShop();
        healthyShop.process(supplierRequest);
    }
}
