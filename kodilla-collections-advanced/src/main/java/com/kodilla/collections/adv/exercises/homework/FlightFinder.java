package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure){
        List<Flight> results = new ArrayList<>();
        for (Flight flight: FlightRepository.getFlightsTable()){
            if (flight.getDeparture().equals(departure)){
                results.add(flight);
            }
        }
        return results;
    }
    public List<Flight> findFlightsTo(String arrival){
        List<Flight> results = new ArrayList<>();
        for (Flight flight: FlightRepository.getFlightsTable()){
            if(flight.getArrival().equals(arrival)){
                results.add(flight);
            }
        }
        return results;
    }
}
