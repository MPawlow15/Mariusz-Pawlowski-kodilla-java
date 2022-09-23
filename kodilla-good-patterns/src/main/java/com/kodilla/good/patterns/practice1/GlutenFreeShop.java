package com.kodilla.good.patterns.practice1;

public class GlutenFreeShop implements SupplierProcess{

    @Override
    public SupplierDto process(final SupplierRequest supplierRequest) {

        boolean orderCompleted = DeliveryService.informationAboutTheSupplier(supplierRequest.getUser(),
                supplierRequest.getQuantity(),supplierRequest.getTypeOfProduct());

        if(!orderCompleted){
            GlutenFreeFood glutenFreeFood = new GlutenFreeFood();
            glutenFreeFood.onlyGlutenFreeFood();
            return new SupplierDto(supplierRequest.getUser(), true);
        } else {
            return new SupplierDto(supplierRequest.getUser(), false);
        }

    }
}
