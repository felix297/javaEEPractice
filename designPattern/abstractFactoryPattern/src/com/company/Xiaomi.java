package com.company;

public class Xiaomi implements Phone {
    @Override
    public void call () {
        System.out.println("Xiaomi 14 is dialing for you...");
    }

    @Override
    public void sms () {
        System.out.println("Xiaomi 14 is sending message for you...");
    }
}