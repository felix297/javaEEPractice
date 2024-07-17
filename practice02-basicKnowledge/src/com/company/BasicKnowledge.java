package com.company;

public class BasicKnowledge {
    public static void main (String[] args) {
        int numberInt1 = 3;
        int numberInt2 = 2;
        short numberShort = 1;
        long numberLong = 1L;
        byte numberByte = 1;
        float numberFloat = 1.1f;
        double numberDouble = 1.2d;
        boolean tag = true;
        char character = 'a';

//        System.out.println(numberInt1);
//        System.out.println(numberShort);
//        System.out.println(numberLong);
//        System.out.println(numberByte);
//        System.out.println(numberFloat);
//        System.out.println(numberDouble);
//        System.out.println(tag);
//        System.out.println(character);

//        System.out.println(numberInt1 - numberInt2);
//        System.out.println(numberInt1 + numberInt2);
//        System.out.println(numberInt1 * numberInt2);
//        System.out.println(numberInt1/numberInt2);
//        System.out.println(numberInt1%numberInt2);

//        if (numberInt1 > numberInt2) {
//            System.out.println(numberInt1 + " is larger than " + numberInt2);
//        } else if (numberInt1 < numberInt2) {
//            System.out.println(numberInt1 + " is smaller than " + numberInt2);
//        } else {
//            System.out.println(numberInt1 + " equals to " + numberInt2);
//        }

        int[] nums = {1, 2, 4, 5};
        int length = nums.length;

//        for (int index = 0; index < length; index++) {
//            System.out.println(nums[index]);
//        }

//        for (int ele : nums) {
//            System.out.println(ele);
//        }

//        int index = 0;
//        while (index < length) {
//            System.out.println(nums[index]);
//            index++;
//        }

//        int index = 0;
//        do {
//            System.out.println(nums[index]);
//            index++;
//        } while (index < length);

        int number = 4;
        switch (number) {
            case 1:
                System.out.println("number is 1");
                break;
            case 2:
                System.out.println("number is 2");
                break;

            default:
                System.out.println("number is 0");
        }
    }
}