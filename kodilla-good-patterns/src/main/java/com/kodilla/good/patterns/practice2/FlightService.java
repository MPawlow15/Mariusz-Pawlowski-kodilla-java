package com.kodilla.good.patterns.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    public List<Flight> getAllFlights() {
        Flight flight1 = new Flight("Warsaw", "Prague");
        Flight flight2 = new Flight("Berlin", "Prague");
        Flight flight3 = new Flight("Warsaw", "Vienna");
        Flight flight4 = new Flight("Vienna", "Berlin");
        Flight flight5 = new Flight("Prague", "Vienna");

        List<Flight> currentFlights = new ArrayList<>();
        currentFlights.add(flight1);
        currentFlights.add(flight2);
        currentFlights.add(flight3);
        currentFlights.add(flight4);
        currentFlights.add(flight5);

        return currentFlights;
    }

    public List<Flights> getAllFlightsWithTransfers() {
        Flights flights1 = new Flights("Warsaw", "Prague", "Vienna");
        Flights flights2 = new Flights("Berlin", "Prague", "Vienna");
        Flights flights3 = new Flights("Warsaw", "Vienna", "Berlin");
        Flights flights4 = new Flights("Vienna", "Berlin", "Prague");
        Flights flights5 = new Flights("Prague", "Vienna", "Berlin");

        List<Flights> currentFlights = new ArrayList<>();
        currentFlights.add(flights1);
        currentFlights.add(flights2);
        currentFlights.add(flights3);
        currentFlights.add(flights4);
        currentFlights.add(flights5);

        return currentFlights;
    }

    public List<Flight> findFlightFrom(String from) {

        return getAllFlights().stream()
                .filter(a -> a.getDeparture().equals(from))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightTo(String to) {

        return getAllFlights().stream()
                .filter(a -> a.getArrival().equals(to))
                .collect(Collectors.toList());
    }

    public List<Flights> findFlightWithChange(String from, String to) {

        return getAllFlightsWithTransfers().stream()
                .filter(a -> a.getDeparture().equals(from))
                .filter(a -> a.getArrival().equals(to))
                .collect(Collectors.toList());
    }
}
