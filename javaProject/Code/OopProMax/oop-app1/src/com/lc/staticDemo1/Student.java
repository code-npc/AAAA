package com.lc.staticDemo1;

public class Student {
    static String name;
    public static  int number;
    int age;
    public Student(){
//        Student.number++;
        //只有在同一个类中，调用自己的类变量时，可以直接按如下方式写
        number++;
    }
}
