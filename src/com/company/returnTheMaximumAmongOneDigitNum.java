package com.company;

public class returnTheMaximumAmongOneDigitNum {
    public int returnTheOneDigitMax(int [] A){
        int max = -10;

        for(int i = 0 ; i < A.length; i ++){
            if(A[i] >= -9 && A[i] <= 9){
                if(A[i] > max){
                    max = A[i];
                }
            }
        }
        return max ;
    }
}
