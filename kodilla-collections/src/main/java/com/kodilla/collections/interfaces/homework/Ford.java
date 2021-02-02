package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int brake;
    private  int engine;
    private int intro;

        public Ford(int brake, int engine, int intro) {
        this.brake = brake;
        this.engine = engine;
        this.intro = intro;
    }

    public int getSpeed(){
            return engine;
    }
    public int increaseSpeed(){
            return getSpeed() + intro;
    }
    public int decreaseSpeed() {
            return getSpeed() - brake;
    }
}
