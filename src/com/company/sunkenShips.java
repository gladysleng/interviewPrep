package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sunkenShips {
    public String solution(int N, String S, String T) {
        int sinkedShips = 0;
        int hitShips = 0;

        String[] shipCells = S.split(",");
        List<String> attacks = Arrays.asList(T.split(" "));

        for (int i = 0; i < shipCells.length; i++) {
            List<String> completeShips = new ArrayList<String>();
            char topNum = shipCells[i].charAt(0);
            char topAlpa = shipCells[i].charAt(1);
            char bottomNum = shipCells[i].charAt(3);
            char bottomAlpha = shipCells[i].charAt(4);

            for (char num = topNum; num <= bottomNum; num++) {
                for (char alpha = topAlpa; alpha <= bottomAlpha; alpha++) {
                    completeShips.add(""+num+alpha);
                }
            }
            if (attacks.containsAll(completeShips)) {
                sinkedShips++;
            } else {
                for (String cell : completeShips) {
                    if (attacks.contains(cell)) {
                        hitShips++;
                    }
                }
            }
        }
        String results = sinkedShips + "," + hitShips;
        return results;
    }
}

//
//        int sink = 0;
//        int hit = 0;
//        Set<String> hits = new HashSet<>(Arrays.asList(T.split(" ")));
//        String[] ships = S.split(",");
//        for (String ship : ships) {
//            Set<String> shipComponents = new HashSet<>();
//            char top = ship.charAt(0);
//            char left = ship.charAt(1);
//            char bottom = ship.charAt(3);
//            char right = ship.charAt(4);
//            for (char i = top; i <= bottom; i++) {
//                for (char j = left; j <= right; j++) {
//                    shipComponents.add("" + i + j);
//                }
//            }
//            if (hits.containsAll(shipComponents)) {
//                sink++;
//            } else {
//                for (String com : shipComponents) {
//                    if (hits.contains(com)) {
//                        hit++;
//
//                    }
//                }
//            }
//
//        }
//
//        return "" + sink + "," + hit;
//
//    }
//}
