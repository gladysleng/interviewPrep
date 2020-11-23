package com.company;

import java.util.Arrays;

public class countPrimes {
    public int countPrimes(int n) {
        // initialized all of them as prime
        Boolean[] boolArray = new Boolean[n];
        Arrays.fill(boolArray, true);

        int numOfPrime = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (boolArray[i] == true) {
                for (int j = i; j * i < n; j++) {
                    boolArray[i * j] = false;
                }
            }
        }

        for (int i = 2; i < boolArray.length; i++) {
            if (boolArray[i] == true) {
                numOfPrime++;
            }
        }

        return numOfPrime;
    }
}
