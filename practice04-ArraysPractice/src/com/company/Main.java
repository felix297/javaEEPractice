package com.company;

public class Main {
    public static void main (String[] args) {
        NikeThread nikeThread = new NikeThread();
        Thread thread1 = new Thread(nikeThread, "张三");
        Thread thread2 = new Thread(nikeThread, "李四");
        Thread thread3 = new Thread(nikeThread, "王五");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}