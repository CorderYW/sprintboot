package com.yewei.mytest.conditionalOnBean;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class City {
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 城市code
     */
    private Integer cityCode;
}