package com.lc.interfaceDemo.Case;

import java.util.ArrayList;
import java.util.Scanner;

public class Start extends Input {
    Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("输入你要录入的人数：");
        int n = scanner.nextInt();
        ArrayList<Student> students = input(n);
        ClassManage a = new Start_case2();
        a.print_m(students);
        a.getAv(students);
    }
}
