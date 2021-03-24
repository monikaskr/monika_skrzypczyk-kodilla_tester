package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {
    @Test
    public void packageDeliveredIfCorrectWeight() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String delivery = bean.sendPackage("Kraków, os. Strusia 5", 12);
        Assertions.assertEquals("Package delivered to: Kraków, os. Strusia 5", delivery);
    }
    @Test
    public void packageDeliveredIfNotCorrectWeight() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String delivery = bean.sendPackage("null", 35);
        Assertions.assertEquals("Package not delivered to: null", delivery);
    }

    @Test
    public void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean delivery = bean.deliverPackage("Warszawa, ul. Szaflary 3",35);
        Assertions.assertNotNull(delivery);
    }
}