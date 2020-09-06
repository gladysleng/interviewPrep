package com.company;

import java.util.Arrays;

public class ReturnSmallestPositiveInt {
    public int returnSmallestPositiveInt(int[] A) {

        if(A.length == 0 ){
            return 1;
        }
        Arrays.sort(A);
        if(A[A.length-1] <=0 || A[0]>1){
            return 1;
        }

        for(int i = 0 ; i <A.length-1; i++){
            if(A[i+1] - A[i] > 1){
                if(A[i]>=0)
                {
                    return A[i] + 1;
                }
                else if(A[i+1]>1){
                    return 1;
                }
            }
        }
        return A[A.length-1] + 1;
    }
}
