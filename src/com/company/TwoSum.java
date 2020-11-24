package com.company;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for( int i = 0 ; i < nums.length; i++){
            map.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i ++){
            int remaining = target - nums[i];
            if(map.containsKey(remaining) && map.get(remaining)!= i){
                return new int [] {i,map.get(remaining)};
            }
        }

        throw new IllegalArgumentException("No two sum Solutions");
    }

/*
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        printMap(map);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println(complement);
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    */

}
