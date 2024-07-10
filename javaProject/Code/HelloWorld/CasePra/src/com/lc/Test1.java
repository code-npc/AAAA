package com.lc;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入原票价：");
            double price = sc.nextDouble();
            System.out.println("请输入月份：");
            int month = sc.nextInt();
            System.out.println("请输入类型（1为头等舱，0为经济舱）：");
            int type = sc.nextInt();


            System.out.printf("%.2f\n",fun(price, month, type));
        }
    }

    public static double fun(double price,int month, int type){
        switch (month){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
//                1代表头等舱，0代表经济舱；
                if (type==1){
                    return price*0.9;
                }else if (type==0){
                    return price*0.85;
                }else {
                    System.out.println("输入的类型不合法！！！");
                }
                    break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
                if (type==1){
                    return price*0.7;
                }else if (type==0){
                    return price*0.65;
                }else {
                    System.out.println("输入的类型不合法！！！");
                }
                break;
            default:
                System.out.println("输入的月份不合法！！！");
                break;
        }
        return 0;//表示错误！！！
    }
}
