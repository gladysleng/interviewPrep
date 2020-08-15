package com.company;

import java.util.Arrays;

public class LongestPalindrome {
    public int LongestPalindrome(String s){
        if(s.length() == 1 ){
            return 1;
        }

        char [] sChar = s.toCharArray();
        Arrays.sort(sChar);
        System.out.println(sChar);
        if(sChar[0] == sChar[s.length()-1]){
            return s.length();
        }

        int sum = 0 ;
        int i = 0;
        while(i<sChar.length-1) {
            if (sChar[i] == sChar[i + 1]) {
                sum = sum + 2;
                i = i + 2;
            }
            else{
                i++;
            }
        }

        // if all duplicate cancelled out, bbaa , no need to add one odd alphabet
        //if there are alphabets with no duplicate, s.length() - sum of duplicate will not be 0
        // , therefore add 1 for palindrome.
        if(s.length() != sum){
            sum = sum + 1;
        }
        return sum;
    }
}
