package Arrays;

import java.util.Scanner;

public class PlandriomeNumber {
    public boolean isPalindrome(int x) {
        int r = 0;
        int sum = 0;
        int n = x;
        while(x > 0){
            // ya pr me  reminder find karunga 
            r = x % 10;
            sum = sum * 10 + r;
            x = x / 10;
        }
        if(n == sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
         
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        PlandriomeNumber obj = new PlandriomeNumber();
        boolean result = obj.isPalindrome(num);
        System.out.println("Is Palindrome: " + result);
        sc.close();
    }
}
