package com.company;

public class Space {
    public void printStar(){
        for(int i = 0 ; i <= 4; i ++){
            String star = Double.toString(Math.pow(2,i));
            String padded = String.format("%-20s",star);
            System.out.println(padded);
        }
    }

}
