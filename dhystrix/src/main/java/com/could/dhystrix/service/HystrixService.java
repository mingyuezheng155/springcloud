package com.could.dhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author : zhengmingyue
 * @date : 2021/1/18 15:10
 */

@Service
public class HystrixService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name) {
        return restTemplate.getForObject("http://ribbon-client/hi2?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi" + name + ",sorry,error!";
    }

}
