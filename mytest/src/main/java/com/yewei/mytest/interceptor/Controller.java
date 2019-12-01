package com.yewei.mytest.interceptor;

import com.yewei.mytest.config.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api1")
public class Controller {

    //需要注入
    @Autowired
    private ServerSettings serverSettings;

    @GetMapping("/v1/testProperties")
    public Object testProperties(){
        return serverSettings;
    }
}