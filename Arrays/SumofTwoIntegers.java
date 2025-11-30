package Arrays;

public class SumofTwoIntegers {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    public static void main(String[] args) {
        SumofTwoIntegers solution = new SumofTwoIntegers();
        int a = 5, b = 7;
        System.out.println("Input: a = 5, b = 7 -> Sum: " + solution.getSum(a, b));
    }
}
