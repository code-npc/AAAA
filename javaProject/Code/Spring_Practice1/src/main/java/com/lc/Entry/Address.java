package com.lc.Entry;

import javax.swing.*;

public class Address {
    private String city;
    private String add;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
