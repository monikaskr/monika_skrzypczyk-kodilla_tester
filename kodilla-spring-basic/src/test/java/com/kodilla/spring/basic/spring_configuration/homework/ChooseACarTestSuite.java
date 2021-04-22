package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class ChooseACarTestSuite {

    @Test
    public void checkThatTheLightAreOn() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Cabrio cabrio = (Cabrio) context.getBean("useCabrio");
        //When
        boolean light = cabrio.hasHeadlightsTurnedOn(LocalTime.of(13,12));
        //Then
        //Assertions.assertFalse(light);
    }
    @Test
    public void checkThatTheLightAreOff() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Cabrio cabrio = (Cabrio) context.getBean("useCabrio");
        //When
        boolean light = cabrio.hasHeadlightsTurnedOn(LocalTime.of(21,12));
        //Then
        //Assertions.assertFalse(light);
    }
    @Test
    public void checkWhichCarWillBeUse() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("randomCar");
        //When
        String type = car.getCarType();
        System.out.println(type);
        //Then
        List<String> possibleCar = Arrays.asList("Driving by sedan","Driving by cabrio","Driving by SUV");
        Assertions.assertTrue(possibleCar.contains(type));
    }
}