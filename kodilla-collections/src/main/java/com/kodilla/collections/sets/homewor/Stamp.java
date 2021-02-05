package com.kodilla.collections.sets.homewor;

import java.util.Objects;

public class Stamp {
    private String name;
    private double dimension;
    private boolean stamp;


    public Stamp (String  name, double dimension, boolean stamp){
        this.name = name;
        this.dimension = dimension;
        this.stamp = stamp;
    }

    public String getName(){
        return name;
    }
    public double getDimension(){
        return dimension;
    }

    public boolean isStamp(){
        return stamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp1 = (Stamp) o;
        return Double.compare(stamp1.dimension, dimension) == 0 && stamp == stamp1.stamp && Objects.equals(name, stamp1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimension, stamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimension=" + dimension +
                ", stamp=" + stamp +
                '}';
    }
}
