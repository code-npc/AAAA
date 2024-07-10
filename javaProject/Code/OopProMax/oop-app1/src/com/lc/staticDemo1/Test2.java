package com.lc.staticDemo1;

import com.lc.extendsDemo1.People;

public class Test2 extends People {
    public static void main(String[] args) {
        //记录stdent类创建了多少个对象
        Student student = new Student();

        System.out.println(Student.number);


/*
        //test2类为people的子类，所以test2类可以调用protected关键字修饰的方发，
        //注意：是用子类调用，父类是不能调用的
        Test2 test2 = new Test2();
        test2.public_print();
        test2.protected_print();
*/


    }
}
