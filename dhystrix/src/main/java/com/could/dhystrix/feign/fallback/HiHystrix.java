package com.could.dhystrix.feign.fallback;

import com.could.dhystrix.feign.HystrixFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author : zhengmingyue
 * @date : 2021/1/18 17:02
 */

@Component
public class HiHystrix implements HystrixFeignClient {
    @Override
    public String getHi(String name) {
        return " 获取失败！";
    }
}
