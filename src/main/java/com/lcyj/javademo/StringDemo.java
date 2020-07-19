package com.lcyj.javademo;


import java.io.UnsupportedEncodingException;

/**
 * 字符串：字符长度、字节码长度
 *
 * 编码规范
 * @line  https://www.jianshu.com/p/f855e27a2377
 *
 * @author  lcyj
 *
 */
public class StringDemo {

    public static void main(String[] args) throws UnsupportedEncodingException {
       printByteLength();
    }

    /**
     *  打印字符串的字节码长度
     */
    public static void printByteLength() throws UnsupportedEncodingException {

        System.out.println("测试");
        System.out.println("测试".length());
        // 运行属结果：2
        System.out.println("测试".getBytes("ISO8859-1").length);
        // 运行结果：4
        System.out.println("测试".getBytes("GB2312").length);
        // 运行结果：4
        System.out.println("测试".getBytes("GBK").length);
        // 运行结果：6
        System.out.println("测龤".getBytes("UTF-8").length);


        System.out.println();
        System.out.println("♫".length());
        // 运行属结果：1
        System.out.println("∮".getBytes("ISO8859-1").length);
        // 运行结果：2
        System.out.println("∮".getBytes("GB2312").length);
        // 运行结果：2
        System.out.println("∮".getBytes("GBK").length);
        // 运行结果：3
        System.out.println("∮".getBytes("UTF-8").length);
    }
}
