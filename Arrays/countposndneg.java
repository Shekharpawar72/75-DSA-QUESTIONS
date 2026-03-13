import java.util.Scanner;

public class countposndneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();

          int pos = 0;
            int neg = 0;
            int zero = 0;
            for( int i=0; i<n; i++){
                int num = sc.nextInt();
                if( num > 0 ){
                    pos++;
                }
                else if( num < 0 ){
                    neg++;
                }
                else{
                    zero++;
                }
            }
            System.out.println("Positive numbers: " + pos);
            System.out.println("Negative numbers: " + neg);
            System.out.println("Zeros: " + zero);
        
    }
}
