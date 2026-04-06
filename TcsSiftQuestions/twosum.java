package TcsSiftQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
         int K =sc.nextInt();
          sc.nextLine();
         String  input = sc.nextLine();
           input = input.replaceAll("[^0-9-]"," ").trim();
         String [] parts = input.split("\\s+");
         int arr[] = new int[parts.length];
         
         for(int i=0; i<parts.length;i++){
              arr[i]= Integer.parseInt(parts[i]);
              
         }
         boolean found=false;
         
         for( int i=0;i<arr.length;i++){
             for( int j=i+1; j<arr.length;j++){
                  if(arr[i]+arr[j] == K){
                      System.out.println(Arrays.toString( new int [] {i,j}));
                      found=true;
                  }
             }
         }
          
          if(!found){
             System.out.println(Arrays.toString(new int [] {-1,-1}));
          }
    }
}
