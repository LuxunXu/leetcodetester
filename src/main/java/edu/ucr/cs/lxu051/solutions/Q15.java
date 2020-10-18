package edu.ucr.cs.lxu051.solutions;

import java.util.*;

public class Q15 {

    public static void main(String[] args) {
        Q15 test = new Q15();
        int[] array = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = test.threeSum(array);
        System.out.println(ans);
    }

    public Q15() {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> ansSet = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ansSet.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(ansSet);
    }
}
