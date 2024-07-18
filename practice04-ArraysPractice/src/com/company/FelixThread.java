package com.company;

public class FelixThread extends Thread {
    @Override
    public void run () {
        while (true) {
            System.out.println("Felix's thread...");
        }
    }

}