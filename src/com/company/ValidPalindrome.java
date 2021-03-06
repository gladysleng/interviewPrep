package com.company;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        boolean result = true;
        int i = 0;
        int j = s.length()-1;
        s = s.toLowerCase();

        while(i < j){
            if(!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))){
                i++;
                continue;
            }
            if(!((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))) {
                j--;
                continue;
            }
            if(s.charAt(i) != s.charAt(j)){
                result = false;
                break;
            }
            i++;
            j--;
        }
        return result;
    }
}

