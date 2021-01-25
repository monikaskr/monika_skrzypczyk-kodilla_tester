package com.kodilla.abstracts.homework;

public class Shape {
    static double PI = 3.1415927;
    private int r;

    public Shape(int r) {
        this.r = r;
    }

    public Shape() {

    }

    public double circlePole(double r) {
        return PI * r * r;
    }
    public double circleObwod(double r) {
        return 2 * PI *r;
    }
}
