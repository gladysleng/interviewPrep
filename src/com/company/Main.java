package com.company;

import java.util.List;

class Main {

    public static void main(String[] args) {

	Main m1 = new Main();
	m1.kidsWithCandies();
	m1.numOfStepsToReduceNumToZero();
    }

    public void kidsWithCandies(){
        kidsWithCandies test1 = new kidsWithCandies();
        int [] array = {12,1,1,1,12};
        int extraCandies = 10;
        List<Boolean> results = test1.findGreatestNumberOfCandies(array,extraCandies);
        for(boolean i :results){
            System.out.println(i);
        }
    }

    public void numOfStepsToReduceNumToZero(){
        numOfStepsToReduceNumToZero test = new numOfStepsToReduceNumToZero();
        int numEven = 8;
        int numOdd = 123;
        int zero = 0;

        System.out.println("Even Number: " + test.numberOfSteps(numEven));
        System.out.println("Odd Number: " + test.numberOfSteps(numOdd));
        System.out.println("Zero Number: " + test.numberOfSteps(zero));
    }
}
