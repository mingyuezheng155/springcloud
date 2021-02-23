package com.could.feign.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author : zhengmingyue
 * @date : 2021/1/13 11:46
 *
 */
@Configuration
public class FeignConfig {
    //远程调用失败后重试(重试间隔为100ms 最大重试时间为1是，重试次数为5)
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1L),5);
    }

}
