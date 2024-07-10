package com.lc.template;

public abstract class F {
    public void fun1() {
        System.out.println("重复方法，重复的代码快");
    }

    public void fun2() {
        System.out.println("重复方法，重复的代码快");
    }
    public void fun3(){
        System.out.println("重复方法，重复的代码快");
    }
    public void start(){
        fun1();
        fun2();
        fun3();
        re_write();
    }

    public abstract void re_write();
}
