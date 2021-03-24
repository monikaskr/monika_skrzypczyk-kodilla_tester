package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        NotificationService notificationService = new DeliveryService();
        ShippingCenter application = new ShippingCenter(notificationService);

        application.sendPackage("Hill Street 11, New York", 18.2);
    }
}
