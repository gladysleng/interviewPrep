package com.company;

import java.util.List;

class Main {

    public static void main(String[] args) {

	Main m1 = new Main();
	m1.kidsWithCandies();
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
}
