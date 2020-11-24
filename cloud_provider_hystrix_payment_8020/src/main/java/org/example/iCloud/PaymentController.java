package org.example.iCloud;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 10235627@zte.intra on 20-11-9.
 */
@Controller
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("ok")
    @Hystrix()
    public String paymentInfo_ok() {
        return paymentService.paymentInfo_ok();
    }

    @GetMapping("timeOut")
    public String paymentInfo_timeOut() {
        return paymentService.pymentInfo_TimeOut();
    }
}
