package com.lc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int l = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] arr = new int[m][2];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < 2; j++) {


//            }
        int[] arr1 = null;
        int[] arr2 = null;
        System.out.println(fun(arr1, arr2));
    }

    public static boolean fun (int[] arr1,int[] arr2){
        if(arr1==null&&arr2==null)
            return true;
        if(arr1==null&&arr2!=null || arr1!=null&&arr2==null)
            return false;
        if (arr1.length!=arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }


}



