package com.lc.extendsDemo1;

public class Student extends People{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void print1(){
        System.out.println(name);
        System.out.println();
    }
}
