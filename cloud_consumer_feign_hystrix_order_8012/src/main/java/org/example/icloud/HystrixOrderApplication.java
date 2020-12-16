package org.example.icloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by 10235627@zte.intra on 20-12-14.
 */
@EnableFeignClients
@EnableHystrix
@SpringBootApplication
public class HystrixOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixOrderApplication.class);
    }
}
