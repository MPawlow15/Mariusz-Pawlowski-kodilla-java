package com.kodilla.good.patterns.practice2;

public class Application {

    public static void main (String[] args) {

        FlightService flightService = new FlightService();

        flightService.findFlight("Berlin");
        System.out.println("");
        flightService.findFlight1("Prague");
        System.out.println("");
        flightService.findFlight2("Warsaw", "Berlin");
    }
}
