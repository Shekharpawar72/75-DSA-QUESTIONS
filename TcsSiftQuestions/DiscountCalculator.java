package TcsSiftQuestions;

import java.util.*;

//QUESTION: Discount Calculator
// Given a purchase amount, apply discount based on rules and print final payable amount (rounded to 2 decimal places).
// Discount Rules:
// Amount < 1000 → 5%
// 1000 ≤ Amount < 5000 → 10%
// Amount ≥ 5000 → 15%
// INPUT:
// A single integer (purchase amount)
// OUTPUT:
// Final amount after discount (rounded to 2 decimal places)
// TEST CASES:
// Test Case 1
// Input: 800
// Output: 760.00
// Test Case 2
// Input: 3000
// Output: 2700.00
// Test Case 3
// Input: 6000
// Output: 5100.00

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if(amount <1000){
            double finalamount = amount-(amount*5/100.0);
            System.out.printf("%.2f",finalamount);
        }else if(1000 >= amount && amount< 5000){
                 double finalamount = amount-(amount*10/100.0);
                 System.out.printf("%.2f",finalamount);
        }   else{
               double finalamount = amount-(amount*15/100.0);
                 System.out.printf("%.2f",finalamount);
        }
    sc.close();
    }
}
