package com.could.feign.service;

import com.could.feign.feign.EurekaFeignClient;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : zhengmingyue
 * @date : 2021/1/13 13:59
 */

@Service
public class FeignService {
    @Autowired
    private EurekaFeignClient eurekaFeignClient;

    public String getFromRibbonClient(String name) {
        return eurekaFeignClient.fromRibbonClient(name);
    }
    public String getHi() {
        return eurekaFeignClient.testRibbon1();
    }

}
