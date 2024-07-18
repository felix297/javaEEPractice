package com.company;

public class TomThread implements Runnable {
    @Override
    public void run () {
        Thread thread = Thread.currentThread();
        while (true) {
            System.out.println(thread.getName());
        }
    }
}