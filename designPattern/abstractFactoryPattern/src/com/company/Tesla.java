package com.company;

public class Tesla implements Car {
    @Override
    public void run() {
        System.out.println("Tesla Model 3 is running...");
    }

    @Override
    public void lighting () {
        System.out.println("Tesla Model 3 is lighting for you...");
    }
}