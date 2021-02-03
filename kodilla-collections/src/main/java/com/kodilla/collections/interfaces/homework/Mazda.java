package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car {
    private int brake;
    private int engine;
    private int intro;

    public Mazda(int brake, int engine, int intro) {
        this.brake = brake;
        this.engine = engine;
        this.intro = intro;
    }

    public Mazda(double a) {
    } // jest ona pusta

    public int getSpeed(){
        return engine;
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
