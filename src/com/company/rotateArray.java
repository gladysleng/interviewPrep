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

    public void rotate2(int[] nums, int k) {
        k = k%nums.length;

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }

    public void reverse(int [] nums, int start, int end){

        while(start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
