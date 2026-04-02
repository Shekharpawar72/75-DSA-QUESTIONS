package TcsSiftQuestions;
import java.util.*;


public class happyandsadcal {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          double n = sc.nextDouble();

           double happy=n;
           double sad = 0;

           for( int i =0; i<4; i++){
                    double  newhappy = 0.3*happy+0.5*sad;
                    double  newsad = 0.7*happy+0.5*sad;

                      happy = newhappy;
                      sad = newsad;

           }
           System.out.println((int)happy + " " + (int)sad);
    }
}
