package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ShopRepository {
    public boolean createSale(User user, LocalDateTime getDayOfSale);
}
