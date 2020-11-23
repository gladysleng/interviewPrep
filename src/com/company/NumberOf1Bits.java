package com.company;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int result = 0;

        while(n != 0){
            // take n subtract 1, then use & operator on n and n-1
            // this method is to take out the last 1 bit
            n &= (n-1);
            result ++;
        }
        return result;
    }
}
