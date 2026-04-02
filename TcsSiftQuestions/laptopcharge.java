
//  import java.util.*;
// public class laptopcharge {
//     public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
           
//              int k = sc.nextInt();
            
//              int n = sc.nextInt(); 

          
//              int [] arr = new int[n];

//              for(int i=0; i<n; i++){
//                 arr[i]=sc.nextInt();
//              }
//                       int count=0;
//              for(int i=0; i<n; i++){
//                    if(arr[i]>=k){
//                        System.out.print(arr[i] + " ");
//                      count++;
//                    }

//              }
//                      System.out.println(); // next line
//         System.out.println("Count: " + count);
//              sc.close();

//     }
// }



 package TcsSiftQuestions;
import java.util.*;

public class laptopcharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        System.out.print("Elements >= k: ");

        for (int i = 0; i < n; i++) {
            if (arr[i] >= k) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }

        System.out.println(); // next line
        System.out.println("Count: " + count);

        sc.close();
    }
}