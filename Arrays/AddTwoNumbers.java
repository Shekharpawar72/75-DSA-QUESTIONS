package Arrays;

import java.util.*;

public class AddTwoNumbers{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    while(b!=0){
         int sum = a^b;
         int carry = (a&b) <<1;

         a=sum;
         b= carry;
    }
    System.out.println(a);
  }
}