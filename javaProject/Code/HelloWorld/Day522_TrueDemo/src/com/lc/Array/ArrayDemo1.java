package com.lc.Array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] name = {45,63,12,24,64,49};
        System.out.println(name);
        System.out.println(name[0]);
        System.out.println(name[3]);
        System.out.println(name.length);
        System.out.println("----------------------------------");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
