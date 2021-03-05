package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {
    private UserValidator manipulator = new UserValidator();

    //^[a-zA-Z0-9._-]{3,}$

    @ParameterizedTest
    @ValueSource(strings = {"Monika", "Bartek"})
    public void shouldReturnTrueIfNameIsCorrectly(String text) {
        assertTrue(manipulator.validateUsername(text));
    }
    @ParameterizedTest
    @ValueSource(strings = {".mONIKA.!", ",!BARt_k"})
    public void shouldReturnTrueIfNameIsNotCorrectly(String text) {
        assertFalse(manipulator.validateUsername(text));
    }

    //^([_a-zA-Z0-9-]+(\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*(\.[a-zA-Z]{1,6}))?$
    @ParameterizedTest
    @ValueSource(strings = {"Bazen.Zarek@wp.pl"})
    public void shouldReturnTrueIfEmailIsCorrectly(String text) {
        assertTrue(manipulator.validateEmail(text));
    }
    @ParameterizedTest
    @ValueSource(strings = {"*1bAZArek3@gmail.com"})
    public void shouldReturnTrueIfEmailIsNotCorrectly(String text) {
        assertFalse(manipulator.validateEmail(text));
    }
}
