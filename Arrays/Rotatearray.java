public class Rotatearray {
    public static void reverse(int arr[], int start, int end) {
          while(start <end){
             int temp = arr[start];
             arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
          }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2; // this is the number of times we want to rotate the array.
        k = k % arr.length; // this is to handle the case when k is greater than the length of the array.
        // reverse(arr, 0, arr.length - 1); // this is to reverse the entire array.
        // reverse(arr, 0, k - 1); // this is to reverse the first k elements of the array.
        // reverse(arr, k, arr.length - 1); // this is to reverse the remaining elements of the array.

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
