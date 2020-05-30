package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class kidsWithCandies {

    public List<Boolean> findGreatestNumberOfCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList<Boolean>();
        int max = Arrays.stream(candies).max().getAsInt();

        for(int i = 0 ; i < candies.length; i++){
            if((candies[i] + extraCandies) >= max){
                results.add(true);
            }
            else{
                results.add(false);
            }
        }
    return results;
    }
}
