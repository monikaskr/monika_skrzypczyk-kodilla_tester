package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        double pole1 = ex1.circlePole(5);
        double obwod1 = ex1.circleObwod(5);
        System.out.println("Ex1. Pole wynosi: " + pole1 + " obówd wynosi: " + obwod1);

        Ex2 ex2 = new Ex2();
        double pole2 = ex2.circlePole(3);
        double obwod2 = ex2.circleObwod(3);
        System.out.println("Ex2. Pole wynosi: " + pole2 + " obówd wynosi: " + obwod2);
    }
}
