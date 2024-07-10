package com.lc.extendsDemo1;


public class Test1 {
    public static void main(String[] args) {
        Student student = new Student();

        student.print1();
        student.print2();
        People people = new People();
        people.te();

        //同一个包下，不同类中
//        people.private_print();//报错
        people.protected_print();
        people.wuming_print();
        people.public_print();
    }
}
