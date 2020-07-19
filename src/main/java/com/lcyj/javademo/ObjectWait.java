package com.lcyj.javademo;

/**
 * 如果在非同步控制方法里调用java.util.concurrent.locks.Condition中的await()
 * 和signalAll()或者Object中的wait()，notify()和notifyAll()方法，程序能通过编译，
 * 但运行的时候，将得IllegalMonitorStateException异常。
 */
public class ObjectWait {
    public static void main(String[] args) {
        new ObjectWait().f1();
    }

    public synchronized void f1(){
        System.out.println("f1 开始等待！");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("f1 结束等待！");
    }
}
