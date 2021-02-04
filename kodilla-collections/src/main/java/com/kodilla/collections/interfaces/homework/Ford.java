package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int brake;
    private int engine;
    private int intro;

    public Ford(int brake, int engine, int intro) {
        this.brake = brake;
        this.engine = engine;
        this.intro = intro;
    }

    public Ford(double a) { } // jest ona pusta

    public int getSpeed(){
        return this.engine;
    }

    public void increaseSpeed(){
        int newIncreaseSpeed = this.engine + intro;
        this.engine = newIncreaseSpeed + intro;
        System.out.println(this.engine);
    }
    public void decreaseSpeed() {
        int newDecreaseSpeed = this.engine - brake;
        this.engine = newDecreaseSpeed - brake;
        System.out.println(this.engine);
    }
}