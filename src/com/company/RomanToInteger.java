package com.company;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character,Integer> ref = new HashMap<Character, Integer>();

        ref.put('I', 1);
        ref.put('V', 5);
        ref.put('X', 10);
        ref.put('L', 50);
        ref.put('C', 100);
        ref.put('D', 500);
        ref.put('M', 1000);

        int sum = ref.get(s.charAt(s.length()-1));

        for( int i = s.length()- 2; i >= 0 ; i --){

            if(ref.get(s.charAt(i)) < ref.get(s.charAt(i+1))){
                sum -= ref.get((s.charAt(i)));
            }
            else{
                sum += ref.get((s.charAt(i)));
            }
        }

        return sum;
    }
}
