package com.company;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap <Character, Integer>();

        for(int i = 0 ; i < s.length() ; i++){
            int initialValue = count.getOrDefault(s.charAt(i),0);
            count.put(s.charAt(i),initialValue+1);
        }

        for(int i = 0 ; i < s.length();i++){
            if(count.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
