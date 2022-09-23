package com.kodilla.good.patterns.practice1;

public class SupplierDto {
    private User user;
    private boolean orderCompleted;

    public SupplierDto(User user, boolean orderCompleted) {
        this.user = user;
        this.orderCompleted = orderCompleted;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrderCompleted() {
        return orderCompleted;
    }
}
