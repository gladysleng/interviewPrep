package com.company;

import java.util.Arrays;

public class reverseString {
    public void reverseString(char[] s) {
        char temp;
        System.out.println(Arrays.toString(s));
        for(int i = 0 ; i < s.length/2;i++){
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
