/*
May 31th 2020
 */

package com.company;

public class numOfStepsToReduceNumToZero {
    public int numberOfSteps (int num) {
        int counterForSteps = 0 ;

        while(num != 0){
            if(num%2 == 0){
                num = num/2;
                counterForSteps ++;
            } else{
                num -= 1;
                counterForSteps ++;
            }
        }
        return counterForSteps;
    }
}
