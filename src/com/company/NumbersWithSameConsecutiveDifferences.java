package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersWithSameConsecutiveDifferences {
    public int[] numsSameConsecDiff(int N, int K) {

        List<Integer> result = new ArrayList<Integer>();
        if(N==1){
            for(int i = 0 ; i <= 9;i ++){
                result.add(i);
            }
            int [] r1 = result.stream().mapToInt(i->i).toArray();
            System.out.println(Arrays.toString(r1));
            return r1;
        }

        int j = K;
        for(int i = 0 ; i<= 9 - N; i++){
            if(j <= 9){
                String kStr = Integer.toString(j);
                String iStr = Integer.toString(i);

                boolean value = true;
                String KandI ="";
                for(int a = 0; a < N ; a++){
                    if(value){
                        KandI  += kStr;
                    }
                    else{
                        KandI += iStr;
                    }
                    value ^= true;

                 }
                if(!(KandI.substring(0,1).equals("0"))){
                    int KandIinteger = Integer.parseInt(KandI);
                    result.add(KandIinteger);
                }
                if(N>1 && K!= 0) {
                    boolean value2 = true;
                    String IandK = "";
                    for (int b = 0; b < N; b++) {
                        if (value2) {
                            IandK += iStr;
                        } else {
                            IandK += kStr;
                        }
                        value2 ^= true;

                    }

                    if (!(IandK.substring(0, 1).equals("0"))) {
                        int IandKinteger = Integer.parseInt(IandK);
                        result.add(IandKinteger);
                    }
                }
                j++;
            }
        }

        int [] finalResult = result.stream().mapToInt(i->i).toArray();
        Arrays.sort(finalResult);
        System.out.println(Arrays.toString(finalResult));
        return finalResult;
    }

}
