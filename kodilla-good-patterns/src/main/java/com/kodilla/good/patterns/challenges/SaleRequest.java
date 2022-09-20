package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SaleRequest {
    private User user;
    private LocalDateTime dayOfSale;

    public SaleRequest(User user, LocalDateTime dayOfSale) {
        this.user = user;
        this.dayOfSale = dayOfSale;
    }

    public User getUser() { return user; }

    public LocalDateTime getDayOfSale() { return dayOfSale; }
}
