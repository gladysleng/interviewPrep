package com.company;

import java.util.ArrayList;
import java.util.List;

public class subtractProductAndSum {
    public int subtractProductAndSum(int n) {
        List<Integer> arr = new ArrayList<Integer>();

        while (n > 0) {
            arr.add(n % 10);
            n = n / 10;

        }
        //       arr.forEach(System.out::println);
        int product = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            product *= arr.get(i);
        }
        //     System.out.println(product);
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        //       System.out.println(product-sum);
        return product - sum;
    }

}
