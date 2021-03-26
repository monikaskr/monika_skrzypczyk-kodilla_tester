package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.time.Month;


@Configuration
public class ChooseACar {
    @Bean
    public Cabrio useCabrio() {
        return new Cabrio();
    }
    @Bean
    public Sedan useSedan() {
        return new Sedan();
    }
    @Bean
    public SUV useSUV() {
        return new SUV();
    }

    @Bean
    public Car randomCar() {
        Car car;
        Month month = LocalDate.now().getMonth();

        if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST || month == Month.SEPTEMBER) {
            car = new Cabrio();
       } else if (month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY || month == Month.MARCH) {
            car = new SUV();
        } else {
           car = new Sedan();
        }
        return car;
    }
}
