package com.lc.Array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] num = {16 ,26 ,36 ,6 ,100};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }
}
