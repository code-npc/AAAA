package com.lc.interfaceDemo.Case;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
   private ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public ArrayList input(int n){
        for (int i = 0; i < n; i++) {
            Student student = new Student();

            System.out.println("请输入第"+(i+1)+"个成员的信息：");
            System.out.println("姓名：");
            String name = scanner.next();
            student.setName(name);
            System.out.println("性别：");
            String sex = scanner.next();
            student.setSex(sex);
            System.out.println("成绩：");
            double score = scanner.nextDouble();
            student.setScore(score);

            students.add(student);
        }
        return students;
    }
}
