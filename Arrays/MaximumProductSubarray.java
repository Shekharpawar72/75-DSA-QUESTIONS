package Arrays;


public class MaximumProductSubarray {
     public int maxproduct(int []nums){
              int ans =nums[0];
      int ma =ans;
      int mi = ans;

     for( int i =1; i<nums.length; i++){
        if(nums[i]<0){
              int temp = ma;
              ma = mi;
              mi = temp;
        }
        ma = Math.max(nums[i], ma*nums[i]);
        mi = Math.min(nums[i], mi*nums[i]);
        ans = Math.max(ans , ma);
     }
     return ans;
     }
    public static void main(String[] args) {
        MaximumProductSubarray solution = new MaximumProductSubarray();
        int[] nums = {2,3,-2,4};
       
        System.out.println("Input: [2,3,-2,4] -> Maximum Product Subarray: " + solution.maxproduct(nums));
    }
}
