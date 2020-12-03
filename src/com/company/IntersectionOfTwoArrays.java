package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 =0;
        int p2 = 0;

        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] < nums2[p2]){
                p1++;
            }
            else if (nums1[p1] > nums2[p2]){
                p2++;
            }
            else{
                result.add(nums1[p1]);
                p1++;
                p2++;
            }
        }

        int [] resultArray = new int[result.size()];
        for(int i = 0 ; i < result.size(); i++){
            resultArray[i] = result.get(i);
        }

        return resultArray;

    }
}
