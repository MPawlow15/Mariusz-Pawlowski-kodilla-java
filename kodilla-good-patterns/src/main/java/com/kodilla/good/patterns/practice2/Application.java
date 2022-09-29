package com.kodilla.good.patterns.practice2;

public class Application {

    public static void main (String[] args) {

        FlightService flightService = new FlightService();

        flightService.findFlightFrom("Berlin");
        flightService.findFlightTo("Prague");
        flightService.findFlightWithChange("Warsaw", "Berlin");
    }
}
