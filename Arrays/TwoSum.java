package Arrays;

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length; // imse n length le liya array ka
        for (int i = 0; i < n; i++) { // ye loop pehla element lega 
            for (int j = i + 1; j < n; j++) { // ye dusra element lega
                if (target == nums[i] + nums[j]) {// ye check karega ki dono element ka sum target ke barabar hai ki nahi
                    return new int[] { i, j }; // agar barabar hai to unke index return kar dega
                }
            }
        }
        return new int[] {};// agar koi solution nahi mila to empty array return kar dega
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