package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int year1;

    public OperatingSystem(int year1) {
        this.year1 = year1;
    }
    public void turnOn() {
        System.out.println("turnOn ");
    }

    public void turnOff() {
        System.out.println("turnOff ");
    }

    public int getYear1() {
        return year1;
    }
}
