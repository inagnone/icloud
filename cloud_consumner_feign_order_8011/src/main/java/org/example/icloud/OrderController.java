package org.example.icloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 10235627@zte.intra on 20-11-2.
 */
@Controller
@RequestMapping("feignOrder")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("save")
    @ResponseBody
    public String callPaymentSaveService(  ){
       return orderService.save();
    }

    @GetMapping("timeOut")
    @ResponseBody
    public String callPaymentTimeOut(){
        return orderService.timeOut();
    }
}
