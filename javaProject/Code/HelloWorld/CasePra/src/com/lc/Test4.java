package com.lc;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 3};
        int[] res = fun(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }

    public static int[] fun(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

}
