package com.lc.pojo;

public class User {
    private String name;
    private int age;
    private int sex;//1 代表男，2 代表女
    private int job;//1 代表学生， 2代表老师，3 代表主任 ，4代表校长

    public User() {
    }

    public User(String name, int age, int sex, int job) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", job=" + job +
                '}';
    }
}
