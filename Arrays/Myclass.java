package Arrays;
import java.util.*;


public class Myclass {
    public static int productofsubarray(int nums[]){
           int ans  = nums[0];
           int max= ans;
           int min= ans;

           for( int i =1;i<nums.length; i++){
              int num = nums[i];
              if(num<0){
                  int temp = max;
                  max=  min;
                  min= temp;
              }
              max= Math.max(num , max*num);
              min = Math.min(num , min*num);
              ans = Math.max(max, ans);

           }
           return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
       Myclass obj = new Myclass();
       int ans = obj.productofsubarray(nums);

    System.out.println(ans);
    sc.close();
    
    }
}
