package com.company;

public class MiCar implements Car {
    public MiCar () {
        System.out.println("you have got a Micar");
    }
    @Override
    public void run () {
       System.out.println("Xiaomi Car is running...");
    }

    @Override
    public void lighting () {
        System.out.println("Xiaomi Car is lighting for you...");
    }

}