package com.lc.Array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("---------------------");
        arr[1] = 2;
        arr[0] = 678;
        arr[2] = 554;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        String[] s = new String[3];
        System.out.println(s[0]);
        s[0] = "sjaja";
        System.out.println(s[0]);

    }
}
