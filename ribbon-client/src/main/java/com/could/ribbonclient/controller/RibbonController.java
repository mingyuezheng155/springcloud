package com.could.ribbonclient.controller;

import com.could.ribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhengmingyue
 * @date : 2021/1/8 17:03
 */
@RestController
public class RibbonController {


    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hi")
    public String testRibbon1(@RequestParam(required = false, defaultValue = "forezp") String name) {
        return ribbonService.getTest(name);

    }
}
