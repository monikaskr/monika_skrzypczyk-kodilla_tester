package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private NotificationService notificationService;
    private DeliveryService deliveryService;

    public ShippingCenter(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            success(address);
        } else {
            fail(address);
        }
    }
    public void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}
