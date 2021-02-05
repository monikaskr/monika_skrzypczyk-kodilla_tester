package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        cars.add(new Ford(10,5,2));
        cars.add(new Mazda(5,4,7));
        cars.add(new Opel(10,5,10));

        for (Car car : cars) {
            System.out.println(cars + ", area: ");
            CarUtils.displayCarInfo(car);
        }

        cars.remove(2);

        cars.remove(new Mazda(5,8,7));
        System.out.println("=================== ");

        System.out.println(cars.size());
            for (Car car : cars) {
            System.out.println(car + ", increase: "); car.increaseSpeed();
                System.out.println(", decrease: "); car.decreaseSpeed();
        }
    }
}
