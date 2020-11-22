package com.company;

import java.util.Arrays;

public class trendmicro {

    public boolean solution(int[] A) {
        // write your code in Java SE 8
        int temp = -1;
        int index = -1;
        int duplicateIndex = -1;
        for( int i = 0 ; i < A.length - 1; i++){
            if(A[i] == A[i+1]){
                duplicateIndex = i;
            }
            if(A[i] > A[i +1]){
                if(A[i] == A[duplicateIndex]){
                    temp = A[i];
                    index = duplicateIndex;
                }
                else{
                    temp = A[i];
                    index = i;
                }
                break;
            }
        }
        System.out.println(index);

        if(index != -1) {
            for (int i = A.length - 1; i > 0; i--){
                if(temp > A[i]){
                    A[index] = A[i];
                    A[i] = temp;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(A));
        return isSorted(A);
    }
//1,4,4,5,8,8,10
// 1,2,3,3,2
// 1,2,2,3,2
    public  boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }


}
