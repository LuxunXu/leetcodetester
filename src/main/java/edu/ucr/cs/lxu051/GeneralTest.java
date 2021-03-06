package edu.ucr.cs.lxu051;

import edu.ucr.cs.lxu051.classes.TreeNode;
import edu.ucr.cs.lxu051.solutions.AppearsK;
import edu.ucr.cs.lxu051.solutions.Q28;
import edu.ucr.cs.lxu051.solutions.Q56;
import edu.ucr.cs.lxu051.solutions.Q9;
import edu.ucr.cs.lxu051.utils.TreeUtils;

public class GeneralTest {
    public static void main(String[] args) {
        int[] array = {7, 9, 20, 15, 15, 7, 7};
//        TreeNode test = TreeUtils.buildTree(array);

//        String twoDArray = "1,3;2,6;8,10;15,18";
//        String[] tokens = twoDArray.split(";");
//        int[][] array = new int[tokens.length][tokens[0].split(",").length];
//        for (int i = 0; i < tokens.length; i++) {
//            String nums[] = tokens[i].split(",");
//            for (int j = 0; j < nums.length; j++) {
//                array[i][j] = Integer.parseInt(nums[j]);
//            }
//        }
//        Q56 q56 = new Q56();
//        q56.merge(array);

//        Q28 q28 = new Q28();
//        System.out.println(q28.kmp("aabaaabaaabaabaaac", "AAACAAAA"));

        AppearsK appearsK = new AppearsK();
        System.out.println(appearsK.appearKTimes(array.length, array, 4));
    }
}
