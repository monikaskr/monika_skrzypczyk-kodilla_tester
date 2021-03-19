package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.HashSet;
import java.util.Set;

class GamblingMachineTestSuite {
    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineFile.csv")
    public void haveCorrectQuantityOfNumbers (int one, int two, int tree, int four, int five) throws InvalidNumbersException {
        Set<Integer> usersnumbers = new HashSet<>();
        usersnumbers.add(one);
        usersnumbers.add(two);
        usersnumbers.add(tree);
        usersnumbers.add(four);
        usersnumbers.add(five);
        GamblingMachine gamblingMachine = new GamblingMachine();
        Assertions.assertThrows(InvalidNumbersException.class,()->gamblingMachine.howManyWins(usersnumbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachine2.csv")
    public void haveNotCorrectQuantityOfNumbers (int one, int two, int tree, int four, int five, int six, int seven) throws InvalidNumbersException {
        Set<Integer> usersnumbers = new HashSet<>();
        usersnumbers.add(one);
        usersnumbers.add(two);
        usersnumbers.add(tree);
        usersnumbers.add(four);
        usersnumbers.add(five);
        usersnumbers.add(six);
        usersnumbers.add(seven);
        GamblingMachine gamblingMachine = new GamblingMachine();
        Assertions.assertThrows(InvalidNumbersException.class,()->gamblingMachine.howManyWins(usersnumbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachine3.csv")
    public void haveValueBelowTheRangeAndCorrectQuantity (int one, int two, int tree, int four) throws InvalidNumbersException {
        Set<Integer> usersnumbers = new HashSet<>();
        usersnumbers.add(one);
        usersnumbers.add(two);
        usersnumbers.add(tree);
        usersnumbers.add(four);
        GamblingMachine gamblingMachine = new GamblingMachine();
        Assertions.assertThrows(InvalidNumbersException.class,()->gamblingMachine.howManyWins(usersnumbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachine4.csv")
    public void haveValueAboveTheRangeAndCorrectQuantity (int one, int two, int tree, int four, int five) throws InvalidNumbersException {
        Set<Integer> usersnumbers = new HashSet<>();
        usersnumbers.add(one);
        usersnumbers.add(two);
        usersnumbers.add(tree);
        usersnumbers.add(four);
        usersnumbers.add(five);
        GamblingMachine gamblingMachine = new GamblingMachine();
        Assertions.assertThrows(InvalidNumbersException.class,()->gamblingMachine.howManyWins(usersnumbers));
    }
}