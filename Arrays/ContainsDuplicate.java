package Arrays;

import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
         int[] nums1 = {1, 2, 3, 1};
         int[] nums2 = {1, 2, 3, 4};    
            ContainsDuplicate solution = new ContainsDuplicate();
            System.out.println("Input: [1, 2, 3, 1] -> Contains Duplicate: " + solution.containsDuplicate(nums1));
            System.out.println("Input: [1, 2, 3, 4] -> Contains Duplicate: " + solution.containsDuplicate(nums2));
    }
}
