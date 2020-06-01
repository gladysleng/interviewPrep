package com.company;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class jewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        final String s1 = J;
        final String s2 = S;
        int counter = 0 ;
        Map<String, Long> map =
                Arrays.stream(s2.split("")).
                        collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        String [] charArray = s1.split("");
        for(String str1 : charArray){
            if(map.containsKey(str1)){
                counter += map.get(str1).longValue();
            }
        }
        return counter;
    }

    public int numJewelsInStonesFasterVersion(String J, String S){
        int counter = 0 ;
        for(int i = 0 ; i < S.length(); i ++){
            for (int j = 0 ; j < J.length(); j++){
                if(J.charAt(j) == S.charAt(i)){
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}
