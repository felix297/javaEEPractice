package com.company;

import java.util.ArrayList;

public class Hello {
    public static void main (String[] args) {
//        int count = 0;
//        do {
//            Hello.sayHello();
//            count++;
//        } while (count < 100);

        int number1 = 100;
        int number2 = 200;
        System.out.println("sum = " + sum(number1, number2));

    }

    public static void sayHello () {
        System.out.println("Hello!");
    }

    public static int sum (int number1, int number2) {
        return number1 + number2;
    }
}
