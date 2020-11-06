package org.example.icloud.controller;

import org.example.icloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.example.icloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String port;


    @PostMapping("save")
    @ResponseBody
    public String addPayment(){
        return "调用支付服务"+port;
    }

    @GetMapping()
    @ResponseBody
    public String list(){
        return "调用支付查询服务"+port;
    }

    @GetMapping("timeOut")
    @ResponseBody
    public String timeOut(){
        try {
            Thread.sleep(3000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "调用等待3s方法";
    }
}
