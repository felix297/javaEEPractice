package com.company;

public class Meeting {
    public static void main (String[] args) {
        int[] nums = new int[] {3,11,4,22,1,10};
//        Meeting.bubbleSorting(nums);
        Meeting.insertSorting(nums);

        System.out.println(Meeting.interpolationSearch(nums, 22));

//        for (int ele: nums) {
//            System.out.println(ele);
//        }
    }
    public static int interpolationSearch (int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (target - nums[left]) / (nums[right] - nums[left]) * (right - left);

            if (nums[mid] == target) return mid;

            if (nums[mid] < target) {
                left = mid + 1;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return -1;

    }



    public static int binarySearch (int[] nums, int target) {
        Meeting.selectSorting(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }

            if (nums[mid] > target) {
                right = mid + 1;
            }
        }

        return -1;
    }

    public static int linearSearch (int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static void insertSorting (int[] nums) {
        int length = nums.length;

        if (length == 0) return;

        for (int roundNum = 1; roundNum < length; roundNum++) {
            for (int index = roundNum; index > 0; index--) {
                if (nums[index] < nums[index - 1]) {
                    Meeting.swap(nums, index, index - 1);
                }
            }
        }
    }


    //select sorting
    public static void selectSorting (int[] nums) {
        int length = nums.length;

        if (length == 0) return;

        for (int roundNum = 0; roundNum < length -1; roundNum++) {
            int indexMin = roundNum;
            for (int compareNum = roundNum; compareNum < length; compareNum++) {
                if (nums[compareNum] < nums[indexMin]) {
                    indexMin = compareNum;
                }
            }

            Meeting.swap(nums, indexMin, roundNum);
        }
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index2];
        nums[index2] = nums[index1];
        nums[index1] = temp;
    }

    // bubble sorting
    public static void bubbleSorting(int[] nums) {
        int length = nums.length;

        if (length == 0) return;

        for (int roundNum = 0; roundNum < length - 1; roundNum++) {
            for (int compareNum = 0; compareNum < length - 1; compareNum++) {
                if (nums[compareNum] > nums[compareNum + 1]) {
                    int temp = nums[compareNum];
                    nums[compareNum] = nums[compareNum + 1];
                    nums[compareNum + 1] = temp;
                }
            }
        }
    }
}