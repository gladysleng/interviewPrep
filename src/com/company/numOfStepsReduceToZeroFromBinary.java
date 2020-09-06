package com.company;

public class numOfStepsReduceToZeroFromBinary {
    public int numOfStepsReduceToZeroFromBinary (String S) {
        int steps = 0;
        int tempSteps = 0;

        if (S.isEmpty()) {
            return 0;
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '1') {
                steps = steps + tempSteps + 1;
                tempSteps = 1;
            } else {
                tempSteps++;
            }
        }
        return steps;
    }
}
