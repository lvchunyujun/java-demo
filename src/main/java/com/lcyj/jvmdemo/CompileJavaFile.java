package com.lcyj.jvmdemo;

import java.io.Serializable;

/**
 * > javap -v -p
 *  -help  --help  -?        输出此命令的帮助信息；
 *  -version                 版本信息，其实是当前javap所在jdk的版本信息，不是class在哪个jdk下生成的。
 *  -v  -verbose             输出附加信息（包括行号、本地变量表，反汇编等详细信息）
 *    -l                       输出行号和本地变量表
 *    -c                       对代码进行反汇编
 *  -p  -private             显示所有类和成员
 *    -public                  仅显示公共类和成员
 *    -protected               显示受保护的/公共类和成员
 *  -package                 显示程序包/受保护的/公共类 和成员 (默认)
 *  -s                       输出内部类型签名
 *  -sysinfo                 显示正在处理的类的系统信息 (路径, 大小, 日期, MD5 散列)
 *  -constants               显示静态最终常量
 *  -classpath <path>        指定查找用户类文件的位置
 *  -bootclasspath <path>    覆盖引导类文件的位置
 */
public class CompileJavaFile extends Object implements IBaseService,Comparable<Object>,Serializable {

    /**
     * final static 在编译期赋值；
     *
     */
    private final static String FINAL_STATIC_STR = "最终静态变量字符串";
    /**
     * final  在编译期赋值；
     *
     */
    private final String final_ = "最终变量字符串";
    /**
     * static 在类加载<init>
     */
    private static String STATIC_STR = "静态变量字符串";

    public static int count ;
    static{

    }

    private int fun(int i){
        return i++;
    }

    private double fun1(double i,double j){
        double d = 0;
        synchronized (this){
             d = i + j;
        }
//        for(int ii = 0 ; ii < 20 ; ii++){
//            int u = ii;
//            u++;
//        }

        return i;
    }

    private synchronized int fun(int i,int j){
        return i+j;
    }

    public static void main(String[] args) {


        System.out.println(FINAL_STATIC_STR);
        System.out.println(new CompileJavaFile().final_);
        System.out.println(STATIC_STR);

        new CompileJavaFile().saveUser();
        new CompileJavaFile().toString();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void saveUser() {

    }


    interface Interface0{
        String I_NAME = "服务1";
    }


}
