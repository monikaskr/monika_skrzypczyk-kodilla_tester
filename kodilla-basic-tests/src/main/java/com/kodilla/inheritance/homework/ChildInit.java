package com.kodilla.inheritance.homework;

public class ChildInit {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2015);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        Child child = new Child(2021);
        child.turnOn();

    }
}
