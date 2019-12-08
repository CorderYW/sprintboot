package com.yewei.mytest.classLoaderTest;

public class ClassLoaderView {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("核心类库加载器："+
                ClassLoaderView.class.getClassLoader().loadClass("java.lang.String").getClassLoader());


        System.out.println("类加载器："+ClassLoaderView.class.getClassLoader());
    }
}
