package com.company;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length > 1){
            int p1 = 0 ;
            int p2 = 1;
            while(p2 < nums.length){
                if(nums[p1]== 0 && nums[p2]!= 0){
                    nums[p1] = nums[p2];
                    nums[p2] = 0;
                    p1 ++;
                    p2 ++;
                }
                else if ( nums[p1] == 0 && nums[p2] == 0){
                    p2 ++;
                }
                else{
                    p1 ++;
                    p2++;
                }
            }
        }
    }
}
