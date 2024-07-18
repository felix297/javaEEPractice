package com.company;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NikeThread implements Runnable {
    int total = 10;
    int count = 1;
    Lock lock = new ReentrantLock();

    @Override
    public void run () {
        lock.lock();
        while (count <= total) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("恭喜 " + Thread.currentThread().getName() + " 用户抢到了第 " + count++ + " 双鞋！");
        }

        lock.unlock();
    }
}