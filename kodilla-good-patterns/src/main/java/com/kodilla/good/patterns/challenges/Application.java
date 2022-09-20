package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        SaleDate saleDate = new SaleDate();
        SaleRequest saleRequest = saleDate.sale();

        ProductOrderService productOrderService = new ProductOrderService(new TelephoneSaleRepository(),
                new TelephoneSaleService(), new MailService());

        productOrderService.process(saleRequest);
    }
}