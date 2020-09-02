package com.company;

public class LongestTimeForGivenDigits {
    public String largestTimeFromDigits(int[] A) {
        String result = "" ;
        for (int i = 0 ; i < 4; i++){
            for(int j = 0; j < 4 ; j++){
                for(int k = 0 ; k < 4; k++){
                    if(i == j || j == k || k== i)
                        continue;
                    String hh = A[i] + "" + A[j];
                    //6 because index is 0 , 1, 2, 3, total index - taken index = remaining index
                    String mm = A[k] + "" + A[6-k-i-j];
                    String time = hh + ":"+ mm;
                    if(hh.compareTo("24") < 0 && mm.compareTo("60")< 0 && time.compareTo(result) > 0 ){
                        result = time;
                    }
                }
            }
        }

        return result;
    }
}
