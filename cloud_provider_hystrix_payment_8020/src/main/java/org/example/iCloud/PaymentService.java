package org.example.iCloud;

import org.springframework.stereotype.Service;

/**
 * Created by 10235627@zte.intra on 20-11-9.
 */
@Service
public class PaymentService {

    public String paymentInfo_ok(){
        return "ok线程池:" + Thread.currentThread().getName();
    }

    public String pymentInfo_TimeOut(){
        return "timeOut线程池:" + Thread.currentThread().getName();
    }


}
