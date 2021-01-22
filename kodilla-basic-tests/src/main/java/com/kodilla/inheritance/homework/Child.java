package com.kodilla.inheritance.homework;

public class Child extends OperatingSystem {

    public Child(int year1) {
        super(year1);
    }

    public void turnOn() {
        System.out.println("turn on of production" + getYear1());
    }

}