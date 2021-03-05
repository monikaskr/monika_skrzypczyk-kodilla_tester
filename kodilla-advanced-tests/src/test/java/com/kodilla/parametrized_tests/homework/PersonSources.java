package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideDate() {
        return Stream.of(
                Arguments.of(1.63, 68,"Overweight"),
                Arguments.of(1.50, 50,"Normal (healthy weight)"),
                Arguments.of(1.53, 82,"Obese Class II (Severely obese)"),
                Arguments.of(1.68, 43,"Severely underweight"),
                Arguments.of(1.42, 85,"Obese Class III (Very severely obese)")
        );
    }
}
