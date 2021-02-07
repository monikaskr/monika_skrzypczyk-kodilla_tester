package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> schools = new ArrayList<>();

    public School(double... schools) {
        for (double school : schools)
            this.schools.add(school);
    }

    @Override
    public String toString() {
        return "School{" +
                "schools=" + schools +
                '}';
    }
}
