package com.neoteric.uber.manoj;

public class User {

    public String name;

    public String Address;

    public int age;

    public double mobile;

    public String fatherName;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", age=" + age +
                ", mobile=" + mobile +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}
