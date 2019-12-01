package com.yewei.mytest.conditionalOnBean;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class People {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     *  城市信息
     */
    private City city;
}