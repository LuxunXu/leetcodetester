package edu.ucr.cs.lxu051.solutions;

import edu.ucr.cs.lxu051.utils.TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Q56 {

    public static void main(String[] args) {
        int[][] intervals = TwoDArray.gen2DArray("2,6;1,3;8,10;15,18");
        int[][] output = merge(intervals);
        System.out.println(Arrays.toString(output));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> mergedList = new ArrayList<>();
        if (intervals.length == 0) return new int[][]{};
        int[] curInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= curInterval[1]) { // can merge
                curInterval[1] = Math.max(intervals[i][1], curInterval[1]);
            } else {
                mergedList.add(curInterval);
                curInterval = intervals[i];
            }
        }
        mergedList.add(curInterval);

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
