package com.yewei.mytest.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="test")
public class ServerSettings {
    //这是不需要写vlaue标签，只要text.name去掉前缀test后的name和这里name相同，就会自动赋值
    private String name;

    //域名地址
    private String domain;

}
