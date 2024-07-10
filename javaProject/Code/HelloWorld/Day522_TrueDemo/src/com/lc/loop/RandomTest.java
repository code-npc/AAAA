package com.lc.loop;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(10);//随机生成0——9的数字
        System.out.println("随机生成："+number);
    }
}
