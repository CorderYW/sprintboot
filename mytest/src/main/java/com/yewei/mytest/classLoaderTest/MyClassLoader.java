package com.yewei.mytest.classLoaderTest;

import java.io.*;

public class MyClassLoader extends ClassLoader {
    private String path;
    private String loadClassName;

    public MyClassLoader(String path,String loadClassName) {
        this.path = path;
        this.loadClassName = loadClassName;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        try {
            byte[] bytes = loadClassData();
            return defineClass(name,bytes,0,bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    private byte[] loadClassData() throws IOException {
        String fullName = path + loadClassName +".class";
        InputStream is = null;
        ByteArrayOutputStream os = null;

        try{
            is = new FileInputStream(new File(fullName));
            os = new ByteArrayOutputStream();
            int i =0;
            while ((i= is.read())!= -1){
                os.write(i);
            }
        }catch (Exception e){

        }finally {
            if(os!=null){
                os.close();
            }
            if(is != null){
                is.close();
            }
        }

        return os.toByteArray();
    }
}
