package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class TelephoneSaleRepository implements ShopRepository {
    @Override
    public boolean createSale(User user, LocalDateTime getDayOfSale) {
        System.out.println("On: " + getDayOfSale.toString() + " person: " + user.name + user.lastName);

        return false;
    }
}
