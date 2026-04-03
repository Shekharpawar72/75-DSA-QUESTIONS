package TcsSiftQuestions;
import java.util.*;

public class Speedclaculate {
    
    public static void main(String [] args){
          Scanner sc = new Scanner(System.in);

          int distancse = sc.nextInt();
          int time = sc.nextInt();
            if (distancse <=0 || time <0 || time>60) {
                System.out.println("invlaid input ");
                return;
            }

           double speed = (distancse*18.0)/(time*5.0);

           System.out.println((int)speed);
    }
}
