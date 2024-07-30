package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysPractice {
    public static void main (String[] args) {
//        List<Integer> nums = Arrays.asList(1,2,3,4);
//        List<String> strs = Arrays.asList(new String[]{"apple", "app"});

//        for (int index = 0; index < nums.size(); index++) {
//            System.out.println(nums.get(index));
//        }

//        for (int index = 0; index < strs.size(); index++) {
//            System.out.println(strs.get(index));
//        }

//        int[] nums = {1,2,3,4,5};
//        int res = Arrays.binarySearch(nums, 1);
//        System.out.println(res);

//        int res2 = Arrays.binarySearch(nums, 1, 3, 4);
//        System.out.println(res2);

//        String[] strs = {"apple", "nums"};
//        System.out.println(Arrays.binarySearch(strs, 0, 1, "apple"));

//        int[] nums = {1,2,3,3,5};
//        int[] nums2 = {1,2,3,4,3};
//        System.out.println(Arrays.compare(nums, nums2));
//        System.out.println(Arrays.compare(nums, 1, 4, nums2, 1, 4));

//        int[] nums = {1,2,3,-4}; // 无符号数不是你想的那样，复制会大于所有的正值
//        int[] nums2 = {1,2,3,4};
//        System.out.println(Arrays.compareUnsigned(nums, nums2));

//        int[] arr = {1,2,3,4};
//        int[] numsCopied = {9,9,9,9,9};
//        numsCopied = Arrays.copyOf(arr, 3);
//        for (int ele: numsCopied) {
//            System.out.println(ele);
//        } // 长度也给你修剪了。。。
//
//        System.out.println(numsCopied.length); // 因为 Arrays.copyOf() 返回的是新的数组，所以你第 41 行的代码就是改了 numsCopied 这个数组原来的引用而已。

//        int[] copyRange = Arrays.copyOfRange(arr, 2, arr.length);
//        for (int ele: copyRange) {
//            System.out.println(ele);
//        }

//        String[] nums1 = {"apple", "app"};
//        String[] nums2 = {"apple", "app"};
//        System.out.println(Arrays.deepEquals(nums1, nums2));

//        int[][] nums1 = {{1,2,3},{1,2,3},{},{}};
//        int[][] nums2 = {{1,2,3},{1,2,3},{},{}};
//        int[][] nums3 = nums1;

//        System.out.println(Arrays.equals(nums1, nums2));
//        System.out.println(Arrays.deepEquals(nums1, nums2));
//        System.out.println(Arrays.equals(nums1, nums3));
//        System.out.println(Arrays.deepEquals(nums1, nums3));
//        System.out.println(Arrays.equals(nums1, 1, 2, nums2, 2, 3));

//        int[] nums = {1,2,3,4};
//        Arrays.fill(nums, 1, 3, 10);

//        for (int ele: nums) {
//            System.out.println(ele);
//        }

//        int[] nums = {1,2,3,4};
//        int[][] nums2 = {{1,2,3}, {1,2,3}, {1,2,3}};
//        System.out.println(Arrays.hashCode(nums));
//        System.out.println(Arrays.hashCode(nums2));
//        System.out.println(Arrays.deepHashCode(nums2));

//        int[] nums1 = {1,2,2,4,5};
//        int[] nums2 = {1,2,3,4,6};
//        System.out.println(Arrays.mismatch(nums1, 3, 5, nums2, 3, 5));

//        int[] num1 = {1,2,3,4};
//        int[] num2 = {1,2,3,4};
//        Arrays.parallelPrefix(num1, (ele1, ele2) -> ele1 + ele2);
//        for (int ele: num1) {
//            System.out.println(ele);
//        }

        int[] nums1 = {1,2,3,4};
        Arrays.setAll(nums1, (ele) -> ele * ele);
//        for (int ele: nums1) {
//            System.out.println(ele);
//        }

        System.out.println(nums1.toString());
        System.out.println(Arrays.toString(nums1));

//        int[] nums = {3,2,2,5,3,2};
//        Arrays.parallelSort(nums, 3, nums.length);
//        for (int ele: nums) {
//            System.out.println(ele);
//        }
//        Arrays.sort(nums, 3, nums.length);
//        for (int ele: nums) {
//            System.out.println(ele);
//        }



    }
}
