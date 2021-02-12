package com.kodilla.collections.adv.exercises.homework;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {

    static Set<Flight> getFlightsTable(){
        Set<Flight> flights = new HashSet<>();
        flights.add (new Flight ("Kraków", "FLoryda"));
        flights.add (new Flight ("Warszawa", "Zanzibar"));
        flights.add (new Flight ("Katowice", "Hiszpania"));

        return flights;
    }
}
