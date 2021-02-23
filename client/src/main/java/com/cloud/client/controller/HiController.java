package com.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhengmingyue
 * @date : 2021/1/11 10:46
 */

@RestController
public class HiController {

    @Value("${spring.application.name}")
    private String name;


    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String Hi() {
        return "hi" + name+":"+port;
    }
}
