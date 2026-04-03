package TcsSiftQuestions;
import java.util.*;

public class Maxsumsubarray {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n<=0){
		     System.out.println("error");
		     return;
		}
		
		int arr[] = new int [n];
		
		for( int i=0;i<n;i++){
		     if(!sc.hasNextInt()){
		         System.out.println("error");
		         return;
		     }
		     arr[i]=sc.nextInt();
		}
		
		int currsum =arr[0];
		int maxsum = arr[0];
		int start =0 , end =0 , tempstart=0;
		
		for( int i=0; i<n; i++){
		    if(currsum<0){
		         currsum = arr[i];
		         tempstart=i;
		    }else{
		      currsum+=arr[i];
		    }
		    
		    if(currsum>maxsum){
		         maxsum= currsum;
		         start=tempstart;
		         end=i;
		    }
		}
		 System.out.println("Maximum Sum = " + maxsum);

        System.out.print("Subarray = ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}
