package com.lc.loop;

import java.util.Random;
import java.util.Scanner;

public class GessNumberGame {
    public static void main(String[] args) {
        Random r = new Random();
//        随机生成一个1——100的数字
        int number = r.nextInt(100)+1;
        System.out.println("请输入你猜的数字:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {

            if(num>number){
                System.out.println("猜的过大.");
            } else if(num < number) {
                System.out.println("猜的过小.");
            }
            num = sc.nextInt();
        }while(number!=num);
        System.out.println("猜对啦!!游戏结束.");

    }
}
