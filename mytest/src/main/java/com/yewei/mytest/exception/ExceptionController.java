package com.yewei.mytest.exception;

import com.yewei.mytest.config.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    //需要注入
    @GetMapping("/v1/exception")
    public Object testProperties(){
        int a = 0;
        int b = 10;

        return b/a;
    }
}