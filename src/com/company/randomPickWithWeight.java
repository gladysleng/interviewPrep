package com.company;

public class randomPickWithWeight {

    //cumulative array
    int [] w_sum;
    public randomPickWithWeight(int[] w) {
        w_sum = new int[w.length];
        int sum = 0;

        for(int i = 0 ; i < w.length; i++){
            sum += w[i];
            w_sum[i] = sum;
        }


    }

    public int pickIndex() {
        int randomNo = (int) (w_sum[w_sum.length-1] * Math.random());
        /*
        this return linear seach
        for( int i = 0 ; i< w_sum.length ; i++){
            if(randomNo < w_sum[i]) {
                return i;
            }

        }

         */
        // use binary search
        int result = -1;
        int startIndex = 0 ;
        int endIndex = w_sum.length-1;

        while(startIndex <= endIndex){
            int mid = (startIndex + (endIndex - startIndex)/2);
            if(randomNo < w_sum[mid]){
                result = mid;
                endIndex = mid -1;
            }
            else{
                startIndex = mid +1;
            }
        }
        return result;
    }
}
