package com.yewei.mytest.classLoaderTest;

import java.net.URL;
import java.net.URLClassLoader;

public class MyLoadClassTest {
    public static void main(String[] args) throws Exception {

        while(true){
            MyClassLoader loader = new MyClassLoader("D:\\sampleCode\\","TestService");

            //指定父类加载器。
            Class clazz = loader.loadClass("TestService");

            System.out.println("TestService 的类加载器："+clazz.getClassLoader());

            Thread.sleep(1000);

            Object newInstance = clazz.newInstance();
            Object doTest = clazz.getMethod("doTest").invoke(newInstance);
            Thread.sleep(1000);
            System.out.println("===========");

        }
    }

}
