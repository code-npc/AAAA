package com.lc.interfaceDemo.Case;

import java.util.ArrayList;

public class Start_case1  implements ClassManage{
    @Override
    public void getAv(ArrayList<Student> students) {
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).getScore();
        }
        System.out.println("所有学生的平均成绩为： "+sum/students.size());
    }

    @Override
    public void print_m(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("姓名："+students.get(i).getName());
            System.out.println("性别："+students.get(i).getSex());
            System.out.println("成绩："+students.get(i).getScore());
            System.out.println("____________________________________________");
        }
    }
}
