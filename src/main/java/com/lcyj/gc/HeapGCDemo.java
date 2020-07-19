package com.lcyj.gc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HeapGCDemo {

    public static void main(String[] args){

        List<String> list = new ArrayList<String>();
        Random random = new Random();
        for(int i = 0 ; i < 20000000 ; i++){
            list.add(random.nextInt(20000)+"");
            System.out.println(random.nextInt(20000)+"");
        }
    }
}
