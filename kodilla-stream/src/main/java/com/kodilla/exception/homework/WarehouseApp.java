package com.kodilla.exception.homework;

import com.kodilla.exception.UserDialogs;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder("20245");
        warehouse.addOrder("28555");
        warehouse.addOrder("55545");
        warehouse.addOrder("255545");
        warehouse.addOrder("209855");

        Order numberOfRounds = null;
        try {
            numberOfRounds = warehouse.getOrder("209800");
        } catch (OrderDoesntExistException e) {
            e.printStackTrace();
        }
        System.out.println("Wyszukane zamówienie to: " + numberOfRounds);
    }
}
