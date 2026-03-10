import java.util.Scanner;

public class vehiclemanfycature {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int v = sc.nextInt();

         int w = sc.nextInt();

         if(v < 0 || w < 0 || v > w){
            System.out.println("invalid input");
            return ;
         }
         int fw = (w - 2 * v) / 2;
         int tw = v - fw;

            System.out.println("number of four wheelers: " + fw);   
            System.out.println("number of two wheelers: " + tw);
    }
}