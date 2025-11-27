package Arrays;

public class MaximumSubarray {
     public int maxSubarray(int [] nums ){
         int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i =0; i<nums.length; i++){
             currsum +=nums[i];
             if(currsum >maxsum){
                 maxsum = currsum;
            }
            if(currsum>0){
                 currsum=0;
            }
        }
        return maxsum;
     }
    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-2,1,4,-1,2,1,4};
       
        System.out.println("Input: [-2,1,-3,4,-1,2,1,-5,4] -> Maximum Subarray Sum: " + solution.maxSubarray(nums));
    }
}
