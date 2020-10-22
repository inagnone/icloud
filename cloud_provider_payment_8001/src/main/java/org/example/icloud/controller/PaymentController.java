package org.example.icloud.controller;

import org.example.icloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.example.icloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("save")
    @ResponseBody
    public String addPayment(){
        return "调用支付服务";
    }

    @GetMapping()
    @ResponseBody
    public String list(){
        return "调用支付查询服务";
    }
}
