package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(15, 150, 10);
        showP(ford);

        Mazda mazda = new Mazda(20, 220, 20);
        showP(mazda);

        Opel opel = new Opel(10, 130, 5);
        showP(opel);

    }
    private static void showP(Car car) {

        for (int i=0; i<3; i++) {
            car.increaseSpeed();
        }

        for (int i=0; i<2; i++) {
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
