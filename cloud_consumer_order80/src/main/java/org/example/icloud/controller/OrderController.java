package org.example.icloud.controller;

import org.example.icloud.common.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    public void createPayment(){
        restTemplate.postForObject("localhost:8001/payment/save", Payment.class,null);
    }
}
