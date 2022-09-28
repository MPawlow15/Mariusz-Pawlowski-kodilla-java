package com.kodilla.good.patterns.practice2;

import java.util.Objects;

public class Flights {

    private String departure;
    private String through;
    private String arrival;

    public Flights(String departure, String through, String arrival) {
        this.departure = departure;
        this.through = through;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getThrough() {
        return through;
    }

    public void setThrough(String through) {
        this.through = through;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(departure, flights.departure) && Objects.equals(through, flights.through) && Objects.equals(arrival, flights.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, through, arrival);
    }

    @Override
    public String toString() {
        return "Flights{" +
                "departure='" + departure + '\'' +
                ", through='" + through + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
