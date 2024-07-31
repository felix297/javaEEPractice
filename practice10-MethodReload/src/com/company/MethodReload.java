package com.company;

public class MethodReload {
    public static void main (String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1.2d, 1.2d));

    }

    public static int sum (int num1, int num2) {
        return num1 + num2;
    }

    public static double sum (double num1, double num2) {
        return num1 + num2;
    }
}

