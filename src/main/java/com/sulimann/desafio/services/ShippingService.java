package com.sulimann.desafio.services;

import org.springframework.stereotype.Service;

import com.sulimann.desafio.entities.Order;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double orderPrice = order.getBasic();

        if(orderPrice < 100.0){
            return 20.0;
        }else if(orderPrice < 200){
            return 12.0;
        }else{
            return 0.0;
        }
    }
    
}
