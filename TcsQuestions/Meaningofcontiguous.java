package TcsQuestions;

import java.util.Deque;
import java.util.LinkedList;

import.java.uitil.*;

public class Meaningofcontiguous {
    public static void main(String[] args) {
          int arr [] = {1, 3, -1, -3, 5, 3, 6, 7};
          int k =3;

        //   for( int i=0; i<arr.length-k; i++){
              
        //     int max = arr[i];
        //     for( int j =1; j<i+k; j++){
        //          if(arr[j]>max){
        //              max = arr[j];
        //          }
        //     }
        //      System.out.println("The maximum element in the subarray is: " + max);
        //   }

        // by using deque

        Deque<Integer> dq = new LinkedList<>();
 
        for(int i=0; i<arr.length; i++){
               if(!dq.isEmpty()&& dq.peekFirst()== i-k){
                 dq.pollFirst();
               }
               // remove elements smaller than the current element
                while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
                     dq.pollLast();
                }
                // add the current element index to the deque
                dq.offerLast(i);
                // print the maximum element in the current window'
                if(i>=k-1){
                    System.out.println("The maximum element in the subarray is: " + arr[dq.peekFirst()]);
                }
        }
          

    }
}
