package com.lcyj.javademo.exception;

import java.io.IOException;
import java.sql.SQLOutput;

public class ExceptionDemo1 {

    int c = 0;

    public static void main(String[] args) {
        ExceptionDemo1 d = new ExceptionDemo1();
        try {
            d.function();
        }catch(Exception e){
            System.out.println("空指针异常");
        }
        System.out.println(d.c);

    }

    public int function(){

        Integer i = 4;

        try{
            i = i/0;
            c+=1;
            return i;
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }catch(Exception e){
            i = -1;
            return i;
        }finally{
            c+=2;
            System.out.println("空指针异常");
        }

        return i;
    }
}
