package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Set;

public class FlightSearch {
    private static boolean checkIfExistsOnMap (Set<String> airportSet, String comparedAirport) {
        boolean isOnMap = airportSet.stream()
                .anyMatch(n -> n.equals(comparedAirport));
        System.out.println(comparedAirport + " exists on map: " + isOnMap);
        return isOnMap;
    }

    public final void findFlight(Flight flight) throws RouteNotFoundException {

        final HashMap<String, Boolean> availability = new HashMap<>();
        availability.put("Berlin", true);
        availability.put("Warsaw", true);


        if (checkIfExistsOnMap(availability.keySet(), flight.arrivalAirport) && checkIfExistsOnMap(availability.keySet(), flight.departureAirport)) {
            System.out.println("System continues to work..");
        } else {
            throw new RouteNotFoundException("no such airport on map");
        }
    }
    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(new Flight("Berlin", "Warsaw"));
        } catch (RouteNotFoundException e) {
            System.out.println("We don't recognize your destination airport");
        }
    }
}