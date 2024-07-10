package com.lc.loop;

public class ForDemo2 {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
        for (int i = 1; i <= 100; i = i+2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
