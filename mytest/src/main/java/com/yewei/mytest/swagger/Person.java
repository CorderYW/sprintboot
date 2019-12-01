package com.yewei.mytest.swagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "用户详细信息")
@Data
public class Person {

    @ApiModelProperty(value = "用户Id", position = 1)
    private Long id;

    @ApiModelProperty(value = "用户年龄", position = 2)
    private int age;

    @ApiModelProperty(value = "用户姓名", position = 3)
    private String name;

    @ApiModelProperty(value = "用户所在城市", position = 4)
    private String city;

    public Person(Long id,int age,String name,String city){
        this.id=id;
        this.age=age;
        this.city=city;
        this.name=name;
    }
}
