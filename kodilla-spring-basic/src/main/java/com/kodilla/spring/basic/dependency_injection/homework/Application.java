package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        DeliveryService deliveryService = new DeliveryService();
        ShippingCenter application = new ShippingCenter(notificationService, deliveryService);

        application.sendPackage("Hill Street 11, New York", 18.2);
    }
}
