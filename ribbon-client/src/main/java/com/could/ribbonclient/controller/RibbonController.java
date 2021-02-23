package com.could.ribbonclient.controller;

import com.could.ribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : zhengmingyue
 * @date : 2021/1/8 17:03
 */
@RestController
public class RibbonController {


    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hi")
    public String testRibbon1() {
        return ribbonService.getTest();

    }


    @Resource
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/testRibbon")
    public String testRibbon() {
        ServiceInstance instance = loadBalancerClient.choose("client");
        return instance.getHost() + ":" + instance.getPort();
    }
}
