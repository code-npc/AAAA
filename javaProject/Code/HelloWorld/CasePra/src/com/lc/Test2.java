package com.lc;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
//        随机生成验证码

        System.out.println(fun(4));
    }
    
    public static String fun(int n){
        Random r = new Random();
        String re = "";
        for (int i = 0; i < n; i++) {

            int number,low,high;
            int a = r.nextInt(3);//随机生成0~2的整数
            switch (a){
                case 0:
                    re += r.nextInt(10);
                    break;
                case 1:
                    re += (char)(r.nextInt(26)+97);//随机生成97~
                    break;
                case 2:
                   re += (char)(r.nextInt(26)+65);//随机生成65~
                    break;

            }
        }
        return re;
    }
}
