package com.company;

public class Earth {
    private static Earth earth = new Earth();

    private int age;
    public void setAge (int age) {
        this.age = age;
    }

    public int getAge () {
        return this.age;
    }

//    private Earth () {
//
//    }

    public static Earth getEarthInstance() {
        return earth;
    }
}