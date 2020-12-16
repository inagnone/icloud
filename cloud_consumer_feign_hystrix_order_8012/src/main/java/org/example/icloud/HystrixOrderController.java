package org.example.icloud;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 10235627@zte.intra on 20-12-14.
 */
@RequestMapping("order")
@DefaultProperties(defaultFallback = "gloubleFallbackFunction")
@RestController
public class HystrixOrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("save")
    @HystrixCommand(fallbackMethod = "timeOutFallbackMethod",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="2000")
    })
    public String callPaymentSaveService(  ){
        return orderService.save();
    }

    @GetMapping("timeOut")
    @HystrixCommand(fallbackMethod = "timeOutFallbackMethod",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="2000")
    })
    public String callPaymentTimeOut(){
        return orderService.timeOut();
    }

    @GetMapping("timeOutGlouble")
    @HystrixCommand
    public String callPatmentTimeOutGloubleFallbackFunction() {
        return orderService.timeOut();
    }

    @GetMapping("timeOutFallbackService")
    public String callPaymentTimeOutFallbackService() {
        return orderService.timeOut();
    }

    public String timeOutFallbackMethod(){
        return "客户端兜低方法";
    }

    public String gloubleFallbackFunction() {
        return "客户端全局兜低方法";
    }
}
