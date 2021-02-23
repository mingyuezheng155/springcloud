package com.could.feign.feign;

import com.could.feign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : zhengmingyue
 * @date : 2021/1/13 11:53
 */
@FeignClient(value = "ribbon-client", configuration = FeignConfig.class)
public interface EurekaFeignClient {
    @GetMapping("hi2")
    String fromRibbonClient(@RequestParam("name") String name);


    @GetMapping("/hi")
     String testRibbon1();
}
