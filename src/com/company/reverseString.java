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
    /*
       public void reverseString(char[] s) {
     int start = 0;
     int end = s.length-1;

     while (start<end){
       char temp = s[end];
       s[end] = s[start];
       s[start] = temp;
       start ++;
       end --;
     }
   }
     */
}
