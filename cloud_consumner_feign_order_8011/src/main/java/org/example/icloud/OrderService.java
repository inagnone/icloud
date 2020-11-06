package org.example.icloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by 10235627@zte.intra on 20-11-5.
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface OrderService {

    @PostMapping("/payment/save")
    public String save();

    @GetMapping("/payment/timeOut")
    public String timeOut();
}


