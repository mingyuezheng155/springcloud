package com.could.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : zhengmingyue
 * @date : 2021/2/5 10:40
 */
@Configuration
public class gatewayConfig {


    /**
     * 基于代码的路由配置方式
     */

//    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("gateway-service", r -> r.query("smile")
                        .uri("https://www.baidu.com"))
                .build();
    }
}
