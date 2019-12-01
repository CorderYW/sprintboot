package com.yewei.mytest;

import com.yewei.mytest.conditional.SystemBean;
import com.yewei.mytest.conditionalOnBean.People;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MytestApplicationConditionalOnBean {

    @Test
    void contextLoads() {
    }
    @Autowired(required=false)
    private People people;

    @Test
    public void test() {
        System.out.println("= = = = = = = = = = = = = ");
        System.out.println("people = " + people);
        System.out.println("= = = = = = = = = = = = = ");
    }
}
