package Arrays;

public class SumofTwoIntegers {
    // Function to calculate sum of two integers without using '+' operator
    public int getSum(int a, int b) { // isme bitwise operation use kiya hai
        while (b != 0) {
            // yahan carry calculate kar rahe hain
            int carry = a & b; // AND operation se carry milta hai
            // yahan sum without carry calculate kar rahe hain
            a = a ^ b; // XOR operation se sum milta hai bina carry ke
            b = carry << 1; // carry ko left shift kar rahe hain taaki next position pe add kar sake
        }
        return a;
    }
    public static void main(String[] args) {
        SumofTwoIntegers solution = new SumofTwoIntegers();
        int a = 5, b = 7;
        System.out.println("Input: a = 5, b = 7 -> Sum: " + solution.getSum(a, b));
    }
}
