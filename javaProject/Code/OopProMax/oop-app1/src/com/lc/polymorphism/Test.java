package com.lc.polymorphism;

public class Test {
    public static void main(String[] args) {
    //多态：行为多态和对象多态
        /* 多态的运行规则是：编译看左边，运行看右边
        *  java的多态只有行为和对象，对象的属性是没有多态的
        * */
        People p1 = new Student();//
        People p2 = new Teacher();

        p1.run();
        p2.run();

    }
}
