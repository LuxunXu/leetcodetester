package edu.ucr.cs.lxu051.solutions;

import java.util.Arrays;

public class AppearsK {

    public AppearsK() {

    }

    public int appearKTimes(int size, int inputArray[], int k) {
        Arrays.sort(inputArray);
        int i = 1, count = 1;
        int element = inputArray[0];
        int res = -1;
        while (i < size) {
            if (element == inputArray[i]) {
                count++;
            } else {
                if (count >= k) {
                    res = element;
                }
                element = inputArray[i];
                count = 1;
            }
            i++;
        }
        if (count >= k) {
            res = element;
        }
        return res;
    }
}
