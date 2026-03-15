import java.util.Scanner;

public class countnonrepating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the elements of the array");

        // ✅ Missing part (input)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ✅ Check non-repeating
        for (int i = 0; i < n; i++) {

            int j;
            for (j = 0; j < n; j++) {

                if (arr[i] == arr[j] && i != j) {
                    break;
                }
            }

            if (j == n) {
                System.out.println(arr[i]);
            }
        }
    }
}