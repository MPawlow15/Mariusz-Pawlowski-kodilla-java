package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {

    private final BigDecimal quantity;

    public Country(BigDecimal quantity) {
        this.quantity = quantity;
    }

    BigDecimal getPeopleQuantity(){
        return quantity;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(quantity, country.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }
}
