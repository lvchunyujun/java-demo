package com.lcyj.jvmdemo.controller;

import java.security.Permission;

public class MySecurityManager extends SecurityManager{

    public void checkPermission(Permission perm){
        System.out.println("权限不足！");
    }
}
