package com.lc.abstractDemo;

public class Dog extends Animal {
    @Override
    public void cry() {
        setName("旺财，");
        System.out.println(getName()+"小狗汪汪汪");
    }
}
