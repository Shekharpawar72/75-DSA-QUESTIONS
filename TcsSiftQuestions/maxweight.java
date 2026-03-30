
 package TcsSiftQuestions;
import java.util.*;

public class maxweight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons:");
        int n = sc.nextInt();
        int[] weights = new int[n];

        System.out.println("Enter the total weight capacity:");
        int totalWeight = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // System.out.println("Enter the weight of person " + (i + 1) + ":");
            weights[i] = sc.nextInt();
        }

        Arrays.sort(weights);

        int count=0;
        int sum =0;
        for( int i=0; i<n;i++){
             if(sum+weights[i]<=totalWeight){ 
                sum+=weights[i];
                count++;
             }
             else{
                 break;
             }
        }
        System.out.println(count);
    }
}
