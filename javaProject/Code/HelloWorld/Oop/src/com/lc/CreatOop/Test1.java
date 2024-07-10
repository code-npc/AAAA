package com.lc.CreatOop;

public class Test1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BYD";
        car.price = 12534;
        System.out.println(car.name);
        System.out.println(car.price);
        car.drive(car.name,car.price);
    }
}
