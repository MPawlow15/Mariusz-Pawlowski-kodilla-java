package com.kodilla.good.patterns.challenges;

public class ShopDto {
    private User user;
    private boolean isSold;

    public ShopDto(final User user, final boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() { return user; }

    public boolean isSold() { return isSold; }

}
