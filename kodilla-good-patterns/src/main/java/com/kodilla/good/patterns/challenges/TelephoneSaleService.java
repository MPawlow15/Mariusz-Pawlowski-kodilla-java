package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class TelephoneSaleService implements ShopService {
    public boolean sale(User user, LocalDateTime getDayOfSale) {
        System.out.println("Selling a phone for: " + user.name + user.lastName + " of the day " + getDayOfSale.toString());

        return true;
    }
}
