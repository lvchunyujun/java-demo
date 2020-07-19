package com.lcyj.jvmdemo;

import java.util.concurrent.TimeUnit;

public class DumpDemo {

    public static void main(String[] args) {
        Integer date = new Integer("20200512");
        System.out.println(date.equals("20200512"));
//        sleep();
    }

    public static void sleep(){
        try {
            System.out.println("start sleep 60s……");
            TimeUnit.SECONDS.sleep(120);
            System.out.println("end sleep !");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
