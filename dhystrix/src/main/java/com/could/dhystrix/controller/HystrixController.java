package com.could.dhystrix.controller;

import com.could.dhystrix.feign.HystrixFeignClient;
import com.could.dhystrix.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : zhengmingyue
 * @date : 2021/1/18 16:24
 */
@RestController
public class HystrixController {


    @Autowired
    private HystrixService hystrixService;

    @Resource
    private HystrixFeignClient hystrixFeignClient;

    @GetMapping("/hi")
    public String hi(@RequestParam("name") String name) {
        return hystrixService.hi(name);

    }

    @GetMapping("/hi2")
    public String getHi2(@RequestParam("name") String name) {
        return hystrixFeignClient.getHi(name);
    }
}
