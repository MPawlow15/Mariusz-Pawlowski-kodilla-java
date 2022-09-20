package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private ShopRepository shopRepository;
    private ShopService shopService;
    private InformationService informationService;

    public ProductOrderService(final ShopRepository shopRepository,
                               final ShopService shopService,
                               final InformationService informationService) {
        this.shopRepository = shopRepository;
        this.shopService = shopService;
        this.informationService = informationService;
    }

    public ShopDto process(final SaleRequest saleRequest){
        boolean isSold = shopService.sale(saleRequest.getUser(),saleRequest.getDayOfSale());

        if(!isSold) {
            informationService.inform(saleRequest.getUser());
            shopRepository.createSale(saleRequest.getUser(), saleRequest.getDayOfSale());
            return new ShopDto(saleRequest.getUser(), true);
        } else {
            return new ShopDto(saleRequest.getUser(), false);
        }
    }
}
