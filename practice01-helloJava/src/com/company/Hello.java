package com.company;

import java.util.ArrayList;

/**
 * @author rogger
 * @since 2024.7.17
 * @version 1.0
 * {@code
 * }
 * int, float, double, boolean, char, byte, short long
 * int, byte, short, long, float, double, boolean, char
 */
public class Hello {
    public static void main (String[] args) {
//        int count = 0;
//        do {
//            Hello.sayHello();
//            count++;
//        } while (count < 100);
        /*
        * the multiple line comment
        * used for comment more than one line
        * */
        int number1 = 100;
        int number2 = 200;
        System.out.println("sum = " + sum(number1, number2));
    }

    /**
     * print Hello! when invoke this method
     * int, short, long, byte, float, double, boolean, char
     */
    public static void sayHello () {
        System.out.println("Hello!");
    }

    /**
     * this method add up two numbers and return the sum of these two number
     * @param number1 the first number to be add
     * @param number2 the second number to be add
     * @return the result of number1 + number2
     */
    public static int sum (int number1, int number2) {
        return number1 + number2;
    }
}
