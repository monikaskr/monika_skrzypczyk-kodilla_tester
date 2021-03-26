package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car{

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime localTime) {
        if (LocalTime.now().isAfter(LocalTime.of(6,0)) && LocalTime.now().isBefore(LocalTime.of(20,0))) {
            return true;
        } else
            return false;
    }

    @Override
    public String getCarType() {
        return "Driving by SUV";
    }
}
