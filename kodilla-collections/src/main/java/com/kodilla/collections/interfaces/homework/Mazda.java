package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Mazda implements Car {
    private int brake;
    private int engine;
    private int intro;

    public Mazda(int brake, int engine, int intro) {
        this.brake = brake;
        this.engine = engine;
        this.intro = intro;
    }



    public int getSpeed(){
        return engine;
    }

    public void increaseSpeed(){
        int newIncreaseSpeed = this.engine + intro;
        this.engine = newIncreaseSpeed + intro;

    }
    public void decreaseSpeed() {
        int newDecreaseSpeed = this.engine - brake;
        this.engine = newDecreaseSpeed - brake;

    }

    @Override
    public String toString() {
        return "Mazda{" +
                "brake=" + brake +
                ", engine=" + engine +
                ", intro=" + intro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mazda mazda = (Mazda) o;
        return brake == mazda.brake && engine == mazda.engine && intro == mazda.intro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brake, engine, intro);
    }
}
