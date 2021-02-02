package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(15, 150, 50);
        showP(ford);

        Mazda mazda = new Mazda(20, 200, 100);
        showP(mazda);

        Opel opel = new Opel(10, 100, 20);
        showP(opel);

    }
    private static void showP(Car car) {
        System.out.println(car.increaseSpeed() + car.increaseSpeed() + car.increaseSpeed());
        System.out.println(car.decreaseSpeed() + car.decreaseSpeed());
        System.out.println(car.getSpeed());
    }
}
