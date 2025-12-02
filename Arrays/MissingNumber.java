package Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();
        int[] nums = {3, 0, 1};
        System.out.println("Input: nums = [3, 0, 1] -> Missing Number: " + solution.missingNumber(nums));
    }
}
