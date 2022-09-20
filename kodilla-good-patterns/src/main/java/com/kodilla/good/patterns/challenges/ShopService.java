package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ShopService {
    public boolean sale(User user, LocalDateTime getDayOfSale);
}
