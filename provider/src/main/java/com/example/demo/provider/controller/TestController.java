package com.example.demo.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaixiang.tao
 * @date 2020/9/23
 */
@RestController
public class TestController {

    @Value("${test.version}")
    private String version;

    @GetMapping("/test")
    public String test() {
        return version;
    }
}
