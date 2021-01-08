package com.could.ribbonclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author : zhengmingyue
 * @date : 2021/1/8 16:55
 */

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;


    public String getTest(String name) {
        return restTemplate.getForObject("http://client/hi?name=" + name, String.class);
    }
}
