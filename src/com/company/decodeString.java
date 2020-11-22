package com.company;

import java.util.Stack;

public class decodeString {
    public String decodeString(String s) {
        Stack<Integer>counts = new Stack();
        Stack<String> str = new Stack();
        String result = "";
        int index = 0 ;

        while(index < s.length()){

            if(Character.isDigit(s.charAt(index))){
                int digits = 0;
                while(Character.isDigit(s.charAt(index))){
                    digits = 10 * digits + (s.charAt(index) -'0');
                    index ++;
                }
                counts.push(digits);
            }
            else if (s.charAt(index) == '['){
                str.push(result);
                result = "";
                index ++;

            }else if (s.charAt(index) == ']'){
                StringBuilder tempStr = new StringBuilder(str.pop());
                int counter = counts.pop();
                for(int i = 0 ; i < counter ;i ++){
                    tempStr.append(result);
                }
                result = tempStr.toString();
                index ++;
            }else {
                result += s.charAt(index) ;
                index ++;
            }
        }
        return result;
    }
}


/*
String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + ch - '0';
            } else if (ch == '[') {
                // push the number k to countStack
                countStack.push(k);
                // push the currentString to stringStack
                stringStack.push(currentString);
                // reset currentString and k
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decodedString = stringStack.pop();
                // decode currentK[currentString] by appending currentString k times
                for (int currentK = countStack.pop(); currentK > 0; currentK--) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }



 */