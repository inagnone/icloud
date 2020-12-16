package org.example.iCloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.stereotype.Service;

/**
 * Created by 10235627@zte.intra on 20-11-9.
 */
@Service
public class PaymentService {

    public String paymentInfo_ok(){
        return "ok线程池:" + Thread.currentThread().getName();
    }

    /**
     *  定义超时时间是3秒
     * @return
     */
    @HystrixCommand(
           fallbackMethod = "timeOutHandler",commandProperties = {
                   @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String pymentInfo_TimeOut(){
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timeOut线程池:" + Thread.currentThread().getName();
    }

    public String timeOutHandler() {
        return "原服务异常，进入兜低方法";
    }

    @HystrixCommand(
            fallbackMethod = "circuitBreakerFallbackFunction",commandProperties = {
                //是否开启断路器
                @HystrixProperty(name="circuitBreaker.enabled",value = "true"),
                //请求次数
                @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
                //时间范围
                @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
                //失败率达到多少后熔断
                @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String paymentCircuitBreaker() {
        return "circuitBreaker service running";
    }
}
