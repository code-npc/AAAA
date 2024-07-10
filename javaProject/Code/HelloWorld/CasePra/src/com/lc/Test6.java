package com.lc;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {18,835,425,767,6155};
        fun(arr);
    }

    public static void fun(int[] arr){
        //方案1：没法放一个红包，将其从数组中删除掉，在其余的红包里继续随机。
        //方案2：直接将红包顺序打乱，然后按顺序发放
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int len = arr.length;
        while(len!=0){
            System.out.print("请输入任意按钮，进行抢红包：");
            sc.next();//此方法只有用户按下回车建后，程序才会继续执行，在这里模拟程序“抢”的动作。

            int x = r.nextInt(len);
            System.out.println("恭喜你抽中了 "+arr[x]+ " 元红包！");
            int temp = arr[x];
            arr[x] = arr[len-1];
            arr[len-1] = temp;
            len--;
        }
        System.out.println("红包已被抢完。");
    }

}
