package com.could.dhystrix.config;


import feign.Retryer;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * @author : zhengmingyue
 * @date : 2021/1/8 16:48
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


    //远程调用失败重试配置(默认)
    @Bean
    public Retryer feignRetryer(){
        //100, TimeUnit.SECONDS.toMillis(1L), 5
        return new Retryer.Default();
    }

}
