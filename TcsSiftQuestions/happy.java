package TcsSiftQuestions;

import java.util.*;
public class happy {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int happy= N;

        int sad=0;

        for(int i=0; i<4; i++){
              double newhappy= 0.3*happy+0.5*sad;
              double newsad= 0.7*happy+0.5*sad;
            
                      happy =(int) newhappy;
                      sad = (int) newsad;


        }
        System.out.println((int)happy);
        System.out.println((int)sad);
        
    }
}
