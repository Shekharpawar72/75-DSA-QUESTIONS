package TcsSiftQuestions;

import java.util.*;
public class Jousepeoblem {
    public static int Josephus(int N , int k ){
        // formula Josephus Problem

        if(N==1){
            return 0;
        }

        return (Josephus(N-1, k)+k)%N;
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
        int K = sc.nextInt(); // 

        int left = Josephus(N, K)+1;
        System.out.println(left);
        
    }
}
