package com.could.dhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableHystrix
@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
@EnableHystrixDashboard //开启仪表盘监控注解
public class DhystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(DhystrixApplication.class, args);
    }

}
