package com.could.ribbon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : zhengmingyue
 * @date : 2021/1/8 16:07
 */
@RestController
public class RestTestController {
    @GetMapping("testRest")
    public String testRest() {

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://www.baidu.com/", String.class);
    }
}
