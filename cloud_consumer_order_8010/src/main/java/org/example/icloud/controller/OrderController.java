package org.example.icloud.controller;

import org.example.icloud.common.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${icloud.paymeny-service-name}")
    private String paymentServiceName;

    @GetMapping("payment")
    public void createPayment(){
        restTemplate.postForObject("http://"+paymentServiceName+"/save", Payment.class,null);
    }
}
