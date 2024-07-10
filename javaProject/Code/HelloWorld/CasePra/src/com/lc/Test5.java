package com.lc;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7};

    }

    public static int[] fun(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

}
