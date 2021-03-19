package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShopTest {
    Shop shop = new Shop();
    Order tshirt = new Order(150, LocalDate.of(2021,3,3),"olaf");
    Order trouser = new Order(280, LocalDate.of(2021,3,6),"mapla1");
    Order shirt = new Order(80, LocalDate.of(2021,2,21),"dymek98");

    @Test
    public void shouldNewAddItemsToShop() {
        //When
        Order shoes = new Order(200, LocalDate.of(2021,3,4),"gigi");
        shop.addItem(shoes);
        int numberOfItems = shop.getSize();
        //then
        assertEquals(4, numberOfItems);
    }
    @Test
    public void shouldGetCorrectItemAboveDwoDate() {
        //When
        List<Order> result = shop.getOrderBetvenDwoDate(LocalDate.of(2021,3,2),LocalDate.of(2021,3,7));
        //Then
        assertEquals(2, result.size());
    }

    @ParameterizedTest
    public void shouldGetCorrectItemAboveMinMax() {
        //When
        List<Order> result = shop.getMinMaxPrice(150,300);
        //Then
        assertEquals(2, result.size());
    }
    @Test
    public void checkItemsInShop() {
        //When
        int numberOfItems = shop.getSize();
        //then
        assertEquals(3, numberOfItems);
    }
    @Test
    public void calculateSum() {
        //When
        double result = shop.addSumOfWartoscZamowienia();
        //Then
        assertEquals(510, result);
    }

    @BeforeEach
    public void initializeShop() {
        shop.addItem(tshirt);
        shop.addItem(trouser);
        shop.addItem(shirt);
    }
}
