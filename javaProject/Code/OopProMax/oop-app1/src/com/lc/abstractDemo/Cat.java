package com.lc.abstractDemo;

public class Cat extends Animal{
    @Override
    public void cry() {
        setName("咪咪，");
        System.out.println(getName()+"小猫喵喵喵");
    }
}
