// ...existing code...
package Arrays;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int prol = 1;
        int pror = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = prol;
            prol = prol * nums[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i] * pror;
            pror = pror * nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        ProductofArrayExceptSelf obj = new ProductofArrayExceptSelf();
        int[] res = obj.productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }
}
// ...existing code...