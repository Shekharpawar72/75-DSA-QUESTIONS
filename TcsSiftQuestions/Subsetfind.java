package TcsSiftQuestions;

public class Subsetfind {
    
}
class Solution {
    static int maxSum = 0;

    public static void helper(int[] arr, int i, int sum, int k) {
        if (sum > k) return;

        maxSum = Math.max(maxSum, sum);

        for (int j = i; j < arr.length; j++) {
            helper(arr, j + 1, sum + arr[j], k);
        }
    }

    public static int maxSubsetSum(int[] arr, int k) {
        maxSum = 0;
        helper(arr, 0, 0, k);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,7};
        int k = 10;
        System.out.println(maxSubsetSum(arr, k)); // Output: 10
    }
}