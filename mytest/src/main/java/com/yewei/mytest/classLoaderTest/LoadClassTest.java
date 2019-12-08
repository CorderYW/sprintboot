package com.yewei.mytest.classLoaderTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class LoadClassTest{
    public static void main(String[] args) throws Exception {

        while(true){
            URL classURL =  new URL("file:D:\\sampleCode\\");
            URLClassLoader parentLoader = new URLClassLoader(new URL[]{classURL});

            //指定父类加载器。
            URLClassLoader loader = new URLClassLoader(new URL[]{classURL},parentLoader);
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
