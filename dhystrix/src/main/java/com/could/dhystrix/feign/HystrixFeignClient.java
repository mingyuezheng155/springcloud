package com.could.dhystrix.feign;

import com.could.dhystrix.feign.fallback.HiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : zhengmingyue
 * @date : 2021/1/18 16:59
 */
@FeignClient(name = "ribbon-client",fallback = HiHystrix.class)
public interface HystrixFeignClient {

    @GetMapping("/hi2")
    String getHi(@RequestParam("name") String name);
}
