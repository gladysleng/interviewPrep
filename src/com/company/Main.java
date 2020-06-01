package com.company;

import java.util.List;

class Main {

    public static void main(String[] args) {

	Main m1 = new Main();
	m1.kidsWithCandies();
	m1.numOfStepsToReduceNumToZero();
	m1.jewelsAndStones();
    }

    public void kidsWithCandies(){
        kidsWithCandies test1 = new kidsWithCandies();
        int [] array = {12,1,1,1,12};
        int extraCandies = 10;
        List<Boolean> results = test1.findGreatestNumberOfCandies(array,extraCandies);
        for(boolean i :results){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
    }

    public void numOfStepsToReduceNumToZero(){
        numOfStepsToReduceNumToZero test = new numOfStepsToReduceNumToZero();
        int numEven = 8;
        int numOdd = 123;
        int zero = 0;

        System.out.print("Even Number: " + test.numberOfSteps(numEven));
        System.out.print(", Odd Number: " + test.numberOfSteps(numOdd));
        System.out.println(", Zero Number: " + test.numberOfSteps(zero));
    }

    public void jewelsAndStones(){
        jewelsAndStones test = new jewelsAndStones();
        String j = "aA";
        String s = "aAAbbbb";
        System.out.print("[j : " + j + " and  s : " + s + "], ");
        System.out.print("Number of j in s is : " + test.numJewelsInStonesFasterVersion(j,s));
    }
}
