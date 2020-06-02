package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class smallerNumberThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] results = new int[nums.length];
        List<Integer> sortedArray = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(sortedArray);
        System.out.print("UnsortedArray: " + Arrays.toString(nums) + " -> Sorted : ");
        sortedArray.forEach(System.out::print);

        for (int i = 0; i< nums.length; i ++){
            results[i] = sortedArray.indexOf(nums[i]);

        }
        System.out.println("");
        System.out.println("results: " + Arrays.toString(results));
       return results;
    }
}
