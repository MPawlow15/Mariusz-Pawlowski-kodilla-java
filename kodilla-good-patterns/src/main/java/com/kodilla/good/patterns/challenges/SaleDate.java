package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SaleDate {
    public SaleRequest sale() {
        User user = new User("John", "Wick");

        LocalDateTime dayOfSale = LocalDateTime.of(2017, 8, 1, 12, 0);

        return new SaleRequest(user, dayOfSale);
    }
}
