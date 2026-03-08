package Arrays;

import java.util.*;

public class ArmstrongNumber {

    // Function to count digits
    public static int countDigits(int num) {
        int count = 0;
        int temp = num;

        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    // Function to check Armstrong number
    public static boolean isArmstrong(int num) {

        int temp = num;
        int amstrong = 0;
        int digits = countDigits(num);   // store once

        while (temp != 0) {

            int reminder = temp % 10;
            int multiply = 1;  // ✅ reset every digit

            for (int i = 0; i < digits; i++) {
                multiply = multiply * reminder;
            }

            amstrong = amstrong + multiply;
            temp /= 10;
        }

        return amstrong == num;
    }

    // Main function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }
}
