package com.could.feign.controller;

import com.could.feign.service.FeignService;
import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhengmingyue
 * @date : 2021/1/13 14:04
 */
@RestController
public class FeignController {


    @Autowired
    private FeignService feignService;

    @GetMapping("/hi2")
    public String getHi2(@RequestParam("name") String name) {
        return feignService.getFromRibbonClient(name);
    }

    @GetMapping("/hi")
    public String getHi() {
        return feignService.getHi();
    }
}
