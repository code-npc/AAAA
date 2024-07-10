package com.lc.extendsDemo1;

public class People {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print2(){
        System.out.println("age");
    }

    private void private_print(){
        System.out.println("private");
    }
    void wuming_print(){
        System.out.println("wuming");
    }

    protected void protected_print(){
        System.out.println("protected");
    }
    public void public_print(){
        System.out.println("public");
    }

    //在同一个类中都可以正常调用
    public void te(){
        private_print();
        wuming_print();
        protected_print();
        public_print();
    }
}
