package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(4.6,6);
        Assertions.assertEquals(10.6, result);
    }
    @Test
    public void shouldReturnCorrectSubtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(5,1.3);
        Assertions.assertEquals(3.7, result);
    }
    @Test
    public void shouldReturnCorrectMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(9.4,3.3);
        Assertions.assertEquals(31.02, result, 0.01);
    }
    @Test
    public void shouldReturnCorrectDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(9.9,3.3);
        Assertions.assertEquals(3.0, result, 0.01);
    }
}
