package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int minResult = calculator.minus(a, b);
        boolean correct2 = ResultChecker.assertEquals(13, minResult);
        if (correct2) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczby " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczby " + a + " i " + b);
        }

        int kwadratResult = calculator.kwadrat(a, b);
        boolean correct3 = ResultChecker.assertEquals(13, kwadratResult);
        if (correct3) {
            System.out.println("Metoda podnoszenia liczby do kwadratu działa poprawnie dla liczb " + a);
        } else {
            System.out.println("Metoda podnoszenia liczby do kwadratu nie działa poprawnie dla liczb " + a);
        }
    }
}
