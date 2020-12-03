package com.company;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        if(digits.length == 1){
            if(digits[0]>= 0 && digits[0]<=8){
                digits[0] = digits[0]+1;
                return digits;
            }else{
                int [] result = new int[digits.length+1];
                result[0] = 1;
                result[1] = 0;
                return result;
            }
        }

        int p1 = digits.length-1;
        int p2 = digits.length-2;

        while(p2 >= 0){
            if(digits[p1]>= 0 && digits[p1]<=8){
                digits[p1] = digits[p1]+1;
                return digits;
            }
            else if(digits[p1] == 9 && digits[p2] < 9){
                digits[p1] = 0;
                digits[p2] = digits[p2] +1;
            }
            else{
                digits[p2] = 0;
                p2--;
            }
        }


            int[] result = new int[digits.length + 1];
            Arrays.fill(result, 0);
            result[0] = 1;
            return result;


    }
}
