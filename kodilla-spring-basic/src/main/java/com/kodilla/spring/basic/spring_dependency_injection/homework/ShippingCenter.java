package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
@Primary
public class ShippingCenter implements NotificationService{

    @Resource(name = "deliveryService")
    private DeliveryService deliveryService;

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return success(address);
        }
        return fail(address);
    }
    public String success(String address) {
        return "Package delivered to: " + address;
    }

    public String fail(String address) {
        return "Package not delivered to: " + address;
    }
}
