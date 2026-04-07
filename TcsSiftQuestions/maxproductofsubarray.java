package TcsSiftQuestions;

import java.util.Scanner;

public class maxproductofsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input  = input.replaceAll("[^0-9-]"," ").trim();
        String [] nums = input.split("\\s+");
        int arr [] = new int [nums.length];
        
        for( int i=0; i<nums.length; i++){
             arr[i]=Integer.parseInt(nums[i].trim());
        }
        
        int ans  = arr[0];
        
        int max=ans;
        int min=ans;
        
        for( int i=1; i<arr.length; i++){
            int num =arr[i];
            
            if(num <0){
                 int temp =max;
                 max =min;
                 min =temp;
            }
            
            max = Math.max(num, max*num);
            min = Math.min(num , min*num);
            ans = Math.max(ans , max);
        }
        System.out.println(ans);
    }
}
