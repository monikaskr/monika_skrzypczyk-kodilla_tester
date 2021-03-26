package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;


@SpringBootTest
class ClockTestSuite {
    @Test
    public void shouldCreateDifferentClockAndCheck() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        TimeUnit.SECONDS.sleep(1);
        Clock secondBean = context.getBean(Clock.class);
        TimeUnit.SECONDS.sleep(1);
        Clock thirdBean = context.getBean(Clock.class);
        System.out.println(firstBean.getTime());
        System.out.println(secondBean.getTime());
        System.out.println(thirdBean.getTime());

        Assertions.assertNotEquals(firstBean.getTime(), secondBean.getTime());
        Assertions.assertNotEquals(secondBean.getTime(), thirdBean.getTime());
        Assertions.assertNotEquals(firstBean.getTime(), thirdBean.getTime());
    }
}