package com.company;

import java.util.Arrays;

public class twoCitiesSchedulingCosts {
    public int twoCitySchedCost(int[][] costs) {
        System.out.println(Arrays.deepToString(costs));

        // sort in increasing order for the differences between a[0] - a[1]
        //if it returns a negative value, the value in a will be ordered before b.
        //if it returns 0, the ordering of a and b won’t change.
        //if it returns a positive value, the value in b will be ordered before a.

        Arrays.sort(costs,(a,b)->{
            return (a[0]-a[1]) - (b[0]-b[1]);
        });
        System.out.println(Arrays.deepToString(costs));
        int sum = 0 ;
        for(int i = 0 ; i < costs.length/2 ; i++){
            sum += costs[i][0];
        }
        for(int j = costs.length/2 ; j <costs.length ; j++ ){
            sum += costs[j][1];
        }
        System.out.println("sum: " + sum);
        return sum;

    }

}
