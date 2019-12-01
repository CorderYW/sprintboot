package com.yewei.mytest;

import com.yewei.mytest.conditional.SystemBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MytestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private SystemBean windows;
    @Autowired
    private SystemBean mac;

    @Test
    public void test() {
        if (windows != null) {
            System.out.println("windows = " + windows);
        }
        if (mac != null) {
            System.out.println("linux = " + mac);
        }
    }
}
