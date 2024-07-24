package com.company;

import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String concatS (String str);
}

public class LambdaPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        Consumer print = (number) -> System.out.println(number);

        nums.forEach(print);

        String[] strs = {"student", "apple", "banana"};
        StringFunction stringFunction = (str) -> str + "s";

        for (String ele: strs) {
            System.out.println(stringFunction.concatS(ele));
        }

    }
}