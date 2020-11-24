package com.company;

public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length == 1? 1:0;
        }
        int result = 0;
        int nextUnique = 1;
        int length = nums.length;

        while(nextUnique < length){
            if(nums[result] != nums[nextUnique]){
                result++;
                nums[result] = nums[nextUnique];
            }
            nextUnique ++;

        }
        return result + 1;
    }
}
