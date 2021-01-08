package com.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhengmingyue
 * @date : 2021/1/8 15:21
 */
@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String getTest(@RequestParam("name") String name) {
        return "hi" + name + "  PORT:" + port;

    }

}
