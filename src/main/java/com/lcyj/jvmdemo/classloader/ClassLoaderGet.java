package com.lcyj.jvmdemo.classloader;


import sun.misc.Launcher;

import javax.sound.midi.Soundbank;
import java.net.URL;
import java.security.Provider;
import java.sql.DriverManager;

/**
 * 类加载器的获取方式:
 *
 */
public class ClassLoaderGet {

    public static void main(String[] args) {

        // 获取当前类加载器
        ClassLoader currentClassLoader = ClassLoaderGet.class.getClassLoader();
        System.out.println(currentClassLoader);

        // 获取当前线程上下文的类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);

        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //
        ClassLoader extClassLoader = classLoader.getParent();
        System.out.println(extClassLoader);

        ClassLoader bsClassLoader = extClassLoader.getParent();
        System.out.println(bsClassLoader);

        // get BootStrap ClassLoader
        ClassLoader bootstrapClassLoader = Provider.class.getClassLoader();
        System.out.println("BootStrap ClassLoader"+bootstrapClassLoader);

        // get Extension ClassLoader
        System.class.getClassLoader();
        System.out.println("BootStrap ClassLoader"+bootstrapClassLoader);


        System.out.println("**************Bootstrap ClassLoading 加载路径*************************");
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for(URL url : urls){
            System.out.println(url);
        }


        System.out.println("**************Extension ClassLoading 加载路径*************************");
        String extDirs = System.getProperty("java.ext.dirs");
        for(String dir : extDirs.split(":")){
            System.out.println(dir);
        }


        // 2. Application ClassLoading


    }
}
