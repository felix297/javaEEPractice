package com.company;

public class TeslaPhone implements Phone {
    @Override
    public void call () {
        System.out.println("Tesla phone is calling for you...");
    }

    @Override
    public void sms () {
        System.out.println("Tesla phone is sending message for you...");
    }
}