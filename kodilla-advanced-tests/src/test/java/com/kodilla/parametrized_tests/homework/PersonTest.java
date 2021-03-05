package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideDate")
    public void shouldCheckCalculatorBMI(double heightInMeters, double weightInKilogram, String expected) {
        Person person = new Person( heightInMeters, weightInKilogram);
        assertEquals(expected, person.getBMI());
    }
}
