package com.lcyj.jvmdemo.classloader;

import com.sun.istack.internal.tools.MaskingClassLoader;

/**
 * 自定义类加载器
 *
 * * jdk1.2 之前定义类加载器，需要重写loadClass这样破坏了双亲委派；
 * * jdk1.2 之后自定义类加载器，只需要覆盖findClass()方法即可，就不会破坏双亲委派；
 *
 * * 如果没有过于复杂的业务逻辑需求，可以直接继承URLClassLoader，这样就免去的编写
 *   findClass()方法的麻烦。
 */
public class LcyjClassLoader extends ClassLoader{

    @Override
    protected Class<?> findClass(String name) {


        return null;
    }
}
