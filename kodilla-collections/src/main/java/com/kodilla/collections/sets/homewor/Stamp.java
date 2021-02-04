package com.kodilla.collections.sets.homewor;

import java.util.Objects;

public class Stamp {
    private String name;
    private double dimension;
    private String marked;

    public Stamp (String  name, double dimension, String marked){
        this.name = name;
        this.dimension = dimension;
        this.marked = marked;
    }
    public String getrName(){
        return name;
    }
    public double getDimension(){
        return dimension;
    }
    public String getMarked(){
        return marked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.dimension, dimension) == 0 && Objects.equals(name, stamp.name) && Objects.equals(marked, stamp.marked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimension, marked);
    }
    @Override
    public String toString() {
        return "Stamp{" + "stamp Name'" + name + '\'' + ", dimension='"
                + dimension + '\'' + ", marked or not=" + marked + '}';
    }
}
