package com.sulimann.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sulimann.desafio.entities.Order;

@Service
public class OrderService {
    
    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double shipment = shippingService.shipment(order);
        double discount = order.getDiscount() / 100 * order.getBasic();
        return order.getBasic() - discount + shipment;
    }
}
