package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car{
    private int brake;
    private int engine;
    private int intro;

    public Opel(int brake, int engine, int intro) {
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
        System.out.println(this.engine);
    }
    public void decreaseSpeed() {
        int newDecreaseSpeed = this.engine - brake;
        this.engine = newDecreaseSpeed - brake;
        System.out.println(this.engine);
    }

    @Override
    public String toString() {
        return "Opel{" +
                "brake=" + brake +
                ", engine=" + engine +
                ", intro=" + intro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return brake == opel.brake && engine == opel.engine && intro == opel.intro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brake, engine, intro);
    }
}
