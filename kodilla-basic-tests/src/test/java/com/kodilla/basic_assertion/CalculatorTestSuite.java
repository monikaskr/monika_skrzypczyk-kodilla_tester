package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int minResult = calculator.sum(a, b);
        assertEquals(13, minResult);
    }
    @Test
        public void testKwadrat() {
        Calculator calculator = new Calculator();
        int a = -4;
        int b = 8;
        int kwadratResult = calculator.kwadrat(a, b);
        assertEquals(16, kwadratResult);
    }
}
