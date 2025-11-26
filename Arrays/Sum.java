package Arrays;

public class Sum {
    public int arraySum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Sum solution = new Sum();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Input: [1, 2, 3, 4, 5] -> Sum: " + solution.arraySum(nums));
    }
}
