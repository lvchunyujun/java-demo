package com.lcyj.jvmdemo.controller;

public class SecurityManagerDemo {

    public static void main(String[] args) {

        System.setSecurityManager(new SecurityManager());
        SecurityManager sm = System.getSecurityManager();
        Class clazz = sm.getClass();
        System.out.println(clazz.getClassLoader());
    }
}
