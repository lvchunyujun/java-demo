package com.lcyj.javademo;

import java.util.concurrent.TimeUnit;

/**
 * 死锁demo
 * 排查：通过JVM jstack ThreadDump(线程快照)排查
 */
public class DeadLock {

    Object lock1 = new Object();
    Object lock2 = new Object();

    public static void main(String[] args) {

        DeadLock d = new DeadLock();

        new Thread(new Runnable() {
            @Override
            public void run() {
                d.f1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                d.f2();
            }
        }).start();


    }

    public void f1(){

        synchronized (lock1){
            System.out.println(Thread.currentThread().getName()+"get lock1!");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2){
                System.out.println(Thread.currentThread().getName()+"get lock2!");
            }
            System.out.println(Thread.currentThread().getName()+"release lock2!");
        }
        System.out.println(Thread.currentThread().getName()+"release lock1!");
    }

    public void f2(){
        synchronized (lock2){
            System.out.println(Thread.currentThread().getName()+"get lock2!");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock1){
                System.out.println(Thread.currentThread().getName()+"get lock1!");
            }
            System.out.println(Thread.currentThread().getName()+"release lock1!");
        }
        System.out.println(Thread.currentThread().getName()+"release lock2!");
    }



}
