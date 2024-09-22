package com.lc.mybatisquickstart.pojo;

public class User {
    private Integer id;
    private String username;
    private Short age;
    private Short job;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Short getJob() {
        return job;
    }

    public void setJob(Short job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", job=" + job +
                '}';
    }
}
