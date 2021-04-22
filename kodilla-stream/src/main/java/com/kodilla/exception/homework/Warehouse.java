package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public void addOrder(String number){
        orders.add(new Order(number));
        }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findAny().orElseThrow(()->new OrderDoesntExistException());
    }
}
