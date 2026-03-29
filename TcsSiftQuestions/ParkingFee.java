package TcsSiftQuestions;

import java.util.Scanner;

public class ParkingFee {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  ya pr mane ashi bs ek varme liya tha 
        if (!sc.hasNextInt()) {
            System.out.println("ERROR");
            return;
        }

        int hours = sc.nextInt();
        int total = 0;

        if (hours <= 2) {
            total = hours * 100;
        } 
        else if (hours <= 5) {
            total = (2 * 100) + (hours - 2) * 50;
        } 
        else {
            total = (2 * 100) + (3 * 50) + (hours - 5) * 20;
        }

        System.out.println(total);

        sc.close();
    }
}
