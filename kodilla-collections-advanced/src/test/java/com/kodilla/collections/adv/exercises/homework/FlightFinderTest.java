package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.Dictionary;
import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import com.kodilla.collections.adv.exercises.dictionary.PartOfSpeech;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    @Test
    public void testFindDeparture (){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Kraków");
        //then
        assertEquals(1, result.size());
    }
    @Test
    public void testFindArrival (){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsTo("Zanzibar");
        //then
        assertEquals(1, result.size());
    }

}