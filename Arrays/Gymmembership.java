package Arrays;
import java.util.*;


public class Gymmembership {
    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
         int n = sc.nextInt();
         
        if(n ==0){
            System.out.println("invalid input or month");
        }else if( n==1){ 
            System.out.println("price is 5000");
        }else if(n==2 || n==3){
             System.out.println("price is 9000");
        }else if(n>4 && n<6){
             System.out.println("price is 12000");
        }else if(n==12){
                System.out.println("price is 20000");
        }else{
            System.out.println("invalid input or month");
        }



    }
}
