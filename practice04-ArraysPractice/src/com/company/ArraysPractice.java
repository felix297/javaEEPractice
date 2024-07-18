package com.company;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysPractice {
    public static void main (String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        String currentTime = "2001-06-01 04:30:30";
//        System.out.println(simpleDateFormat.format(date));
//        try {
//            System.out.println(simpleDateFormat.parse(currentTime));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.getTime());
//        System.out.println(simpleDateFormat.format(calendar.getTime()));
//        System.out.println(calendar.getWeeksInWeekYear());

//        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));

        int[] nums = new int[] {1,2,34,5,2};
//        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(Arrays.copyOf(nums, 2)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 1, 3)));


//        Tree tree = new Tree();
//
//        Integer num1 = 1;
//
//        System.out.println(Math.random());
//
//        System.out.println(ThreadLocalRandom.current().nextInt(10));
//        ThreadLocalRandom.current().ints();


//        tree.setAge(1);
//        System.out.println(tree.getAge());
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            System.out.println(scanner.nextLine());
//        }
    }
//        int[] nums = new int[] {-1,2,333,2,11,22,1};
//        int[] nums2 = new int[] {1,2,333,2,11,22,1};
//        int[] nums3 = new int[3];
////        Arrays.sort(nums);
////        for (int ele: nums) {
////            System.out.println(ele);
////        }
//
////        System.out.println(Arrays.binarySearch(nums, 333));
////        System.out.println(Arrays.equals(nums, nums2));
//
////        Arrays.fill(nums3, 1);
////        for (int ele: nums3) {
////            System.out.println(ele);
////        }
//
//        System.out.println(Arrays.compareUnsigned(nums, nums2));
//
//        System.out.println(sum(1.2d, 1.3d));
//    }
//
//    public static int sum (int number1, int number2) {
//        return number1 + number2;
//    }
//
//    public static double sum(double number1, double number2) {
//        return number1 + number2;
//    }

    public static int sum (int number1, int number2) {
        return number1 + number2;
    }
}