package com.lc;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(fun(3));
    }

    public static double fun(int n){
        Scanner sc = new Scanner(System.in);
        double max = -1;
        double min = 999;
        double score = 0;
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            if (a>max){
                max = a;
            }else if (a<min){
                min = a;
            }
            score += a;
        }
        return (score-max-min)/(n-2);
    }
}
