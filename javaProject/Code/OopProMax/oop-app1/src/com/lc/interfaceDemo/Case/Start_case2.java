package com.lc.interfaceDemo.Case;

import java.util.ArrayList;

public class Start_case2  implements ClassManage{
    @Override
    public void getAv(ArrayList<Student> students) {
        double sum = 0;
        double max=0 ,min = 100;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getScore() > max){
                max = students.get(i).getScore();
            }else if (students.get(i).getScore() < min){
                min = students.get(i).getScore();
            }
            sum += students.get(i).getScore();
        }
        System.out.println("所有学生的平均成绩为： "+ sum/(students.size()-2));
    }

    @Override
    public void print_m(ArrayList<Student> students) {
        int man = 0; int woman = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSex().equals("男")){
                man++;
            }else{
                woman++;
            }
            System.out.println("姓名："+students.get(i).getName());
            System.out.println("性别："+students.get(i).getSex());
            System.out.println("成绩："+students.get(i).getScore());
            System.out.println("____________________________________________");
        }
        System.out.println("男生总人数为："+man+"      女生总人数为："+woman);
    }
}
