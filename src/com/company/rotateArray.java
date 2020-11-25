package com.company;

public class rotateArray {
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        if (nums.length >= 2) {
            for (int i = 0; i < nums.length; i++) {
                int newIndex = (i + k) % nums.length;
                a[newIndex] = nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = a[i];
            }
        }

    }
}
