package Arrays;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Number ");
        int num = sc.nextInt();
       

        boolean isprime = true;

        if(num <=1){
             isprime = false;
        }else{
            for(int i=2; i * i<=num; i++){  // we can also write i<=Math.sqrt(num) and it will work fine but i*i<=num is more efficient than i<=Math.sqrt(num) because it does not require the calculation of the square root.
                 if(num % i == 0){
                        isprime = false;
                        break; /// if we find any divisor of num, we can break the loop because we already know that num is not a prime number.
                 }
            }
        }

        if(isprime){
                 System.out.println(num + " number is Prime number");
        }else{
             System.out.println(num + " Number is not Prime ");
        }
        sc.close();
    }
}
