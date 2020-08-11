package com.company;

import java.util.HashMap;

public class titleToNumber {
    public int titleToNumber(String s) {

        int sum = 0 ;
        String[]singleElement = s.split("");
        HashMap<String,Integer> dict = new HashMap<String, Integer>();
        dict.put("A",1);
        dict.put("B",2);
        dict.put("C",3);
        dict.put("D",4);
        dict.put("E",5);
        dict.put("F",6);
        dict.put("G",7);
        dict.put("H",8);
        dict.put("I",9);
        dict.put("J",10);
        dict.put("K",11);
        dict.put("L",12);
        dict.put("M",13);
        dict.put("N",14);
        dict.put("O",15);
        dict.put("P",16);
        dict.put("Q",17);
        dict.put("R",18);
        dict.put("S",19);
        dict.put("T",20);
        dict.put("U",21);
        dict.put("V",22);
        dict.put("W",23);
        dict.put("X",24);
        dict.put("Y",25);
        dict.put("Z",26);


        for(int i = 0; i < singleElement .length ;i ++){
            if(singleElement .length == 1){
                sum = dict.get(s);
                return sum;
            }
            sum = sum * 26 + dict.get(singleElement[i]);

        }
        return sum;
    }
// faster runtime solution
    public int titleToNumberFasterRuntime(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }

}
