package com.yewei.mytest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    //需要注入
    @Autowired
    private ServerSettings serverSettings;

    @GetMapping("/v1/testProperties")
    public Object testProperties(){
        return serverSettings;
    }
}