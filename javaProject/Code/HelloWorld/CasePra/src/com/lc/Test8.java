package com.lc;

import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        compare(uesrNumber(),luckNumber());


    }

    public static int[] uesrNumber() {
        Random r = new Random();
        int[] arr = new int[7];
        int[] numbers = new int[33];
        //初始化数组numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        int a = 33;
        for (int i = 0; i < arr.length-1; i++) {
            int x = r.nextInt(a) + 1;
            arr[i] = numbers[x];
            int temp = numbers[x];
            numbers[x] = numbers[a - 1];
            numbers[a - 1] = temp;
            a--;
        }

        //红色号码
        arr[6] = r.nextInt(16) + 1;
        return arr;
    }

    public static int[] luckNumber() {
        Random r = new Random();
        int[] arr = new int[7];
        int[] numbers = new int[33];
        //初始化数组numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        int a = 33;
        for (int i = 0; i < 6; i++) {
            int x = r.nextInt(a) + 1;
            arr[i] = numbers[x];
            int temp = numbers[x];
            numbers[x] = numbers[a - 1];
            numbers[a - 1] = temp;
            a--;
        }

        //红色号码
        arr[6] = r.nextInt(16) + 1;
        return arr;
    }


    public static boolean compare(int[] arr1, int[] arr2) {
        System.out.println("你的号码为：");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();


        System.out.println("中奖号码为：");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("恭喜你中奖了！！！！！！！");
            return true;
        }
        else{
            System.out.println("很遗憾，大奖与你擦肩而过。");
            return false;
        }
    }

}
