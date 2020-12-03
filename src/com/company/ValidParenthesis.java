package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {

        Map<Character,Character> mapping = new HashMap<>();
        mapping.put('}','{');
        mapping.put(')','(');
        mapping.put(']','[');

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(mapping.containsKey(c)){
                char topElement = stack.empty()? '#':stack.pop();
                if(topElement != mapping.get(c)){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }

        return stack.empty();
    }
}
