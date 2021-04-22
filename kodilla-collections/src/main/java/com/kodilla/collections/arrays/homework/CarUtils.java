package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {

    public static void displayCarInfo(Car car) {
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("Car kind: " + describeCar(car));
        car.increaseSpeed();
        System.out.print("Car increaseSpeed: " + car.getSpeed());
        car.decreaseSpeed();
        System.out.print("Car decreaseSpeed: " + car.getSpeed());
    }

    public static String describeCar(Car car){
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Mazda)
            return "Mazda";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car name";
    }

}
