package com.company;

public class ReverseInteger {
    public int reverse(int x) {
        boolean negative = false;
        long reversed = 0 ;

        if( x < 0){
            negative = true;
            x *= -1;
        }

        while (x > 0){
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }

        if(reversed > Integer.MAX_VALUE){
            return 0;
        }

        if(negative){
            reversed *= -1;
        }

    return (int)reversed;
    }
}
