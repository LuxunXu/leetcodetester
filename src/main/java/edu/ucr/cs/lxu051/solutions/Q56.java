package edu.ucr.cs.lxu051.solutions;

import java.util.ArrayList;
import java.util.List;

public class Q56 {
    public Q56() {

    }

    public int[][] merge(int[][] intervals) {
        int curL = intervals[0][0];
        int curR = intervals[0][1];
        //int[][] ans = new int[intervals.length][2];
        List<int[]> ans = new ArrayList<>();
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < curL) {
                curL = intervals[i][0];
                curR = Math.max(curR, intervals[i][1]);
            } else if (intervals[i][0] <= curR) {
                curR = Math.max(curR, intervals[i][1]);
            } else {
                int[] a = {curL, curR};
                ans.add(a);
                count++;
                curL = intervals[i][0];
                curR = intervals[i][1];
            }
        }
        int[] a = {curL, curR};
        ans.add(a);
        int[][] finalAns = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            finalAns[i][0] = ans.get(i)[0];
            finalAns[i][1] = ans.get(i)[1];
        }
        return finalAns;
    }
}
