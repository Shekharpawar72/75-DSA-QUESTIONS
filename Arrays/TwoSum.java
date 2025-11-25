package Arrays;

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = solver.twoSum(nums, target);

        if (res.length == 2) {
            System.out.println("Indices: " + res[0] + ", " + res[1]);
            System.out.println("Values: " + nums[res[0]] + ", " + nums[res[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }
}