package com.lc.Array;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        double[] score = new double[2];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextDouble();
        }
        for (int i = 0; i < score.length; i++) {
            System.out.println("第"+(i+1)+"位选手的成绩是:"+score[i]);
        }
    }
}
