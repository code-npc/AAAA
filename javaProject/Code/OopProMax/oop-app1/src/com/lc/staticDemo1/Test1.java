package com.lc.staticDemo1;

import com.lc.extendsDemo1.People;

public class Test1 {
    public static void main(String[] args) {
        //用static关键字修饰的变量被称为类变量，也叫静态变量‘，在计算机中只有一份，被类的所有对象所共享
//        调用方式：类名.变量名

        Student.name = "张三";
        System.out.println(Student.name);
        Student st1 = new Student();
        st1.name = "李四";//不推荐用这种方式调用
        System.out.println(st1.name);
        System.out.println(Student.name);
        //没有static关键字修饰的变量，称之为实例变量，属于每个对象的
        Student st2 = new Student();
        st1.age = 23;
        st2.age = 29;
        System.out.println(Student.number);

       /* //任意包下的任意类中
        People people = new People();
        people.public_print();*/
    }
}
