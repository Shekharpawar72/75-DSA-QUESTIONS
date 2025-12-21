package Arrays;

public class FIndUniqueELement {
     public static int findUnique(int[] arr) {
          int unique = 0;
          for( int num : arr){
                    unique ^=num;
          }
            return unique;
  
        // ku ki tum xor 
         // toh same number ka xor 0 hota hai
         // aur 0 se koi bhi number ka xor number hi hota hai
         /// or jb tum sare number ka xor karoge
         ///  tum xor unique number  se karunga toh woh number return krnge 
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 2};
        int unique = findUnique(arr);
        System.out.println("The unique element is: " + unique);
    }
}
