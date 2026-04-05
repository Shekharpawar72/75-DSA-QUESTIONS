package TcsSiftQuestions;

import java.util.*;

/// format ha iska ek ya 

// public class Imprtant {
// public static void main (String [] args){

//     Scanner sc = new Scanner(System.in);

//     String input = sc.nextLine();
//     String [] parts= input.split(" ");

//     int arr [] = new int [parts.length];

//     for(int i=0; i<parts.length; i++){
//           arr[i]= Integer.parseInt(parts[i]);
//     }
// }
// }



/// ya ek question ke sath or achi se 
/// jb size nhi diya hoga arr ka to
/// eg: 1 2 3 4 5

// public class Imprtant {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Step 1: Input lo
//         String input = sc.nextLine();

//         // Step 2: Split karo
//         String[] parts = input.split(" ");

//         // Step 3: Array banao
//         int[] arr = new int[parts.length];

//         // Step 4: Convert + store
//         for (int i = 0; i < parts.length; i++) {
//             arr[i] = Integer.parseInt(parts[i]);
//         }

//         // Step 5: Sum calculate karo
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }

//         // Output
//         System.out.println("Sum = " + sum);
//     }
// }





/// ya sb agar arr ka size  diya 
/// eg: 5
/// 1 2 3 4 5 
/// ashan hi input hoga to



// import java.util.*;

// public class Important {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Step 1: size lo
//         int n = sc.nextInt();

//         // Step 2: array banao
//         int[] arr = new int[n];

//         // Step 3: elements lo
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
           

//         int sum=0;
//         for(int i=0; i<n;i++){
//              sum+=arr[i];
//         }
//         System.out.println(sum);



//     }}










/// or jb input comma  separated hoga to 
/// // eg: 1,2,3,4,5



// import java.util.*;

// public class Imprtant {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Step 1: Input lo
//         String input = sc.nextLine();

//         // Step 2: Split karo
//         String[] parts = input.split(",");

//         // Step 3: Array banao
//         int[] arr = new int[parts.length];

//         // Step 4: Convert + store
//         for (int i = 0; i < parts.length; i++) {
//             arr[i] = Integer.parseInt(parts[i]);
//         }

//         // Step 5: Sum calculate karo
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }

//         // Output
//         System.out.println("Sum = " + sum);
//     }
// }


// Bracket ke sath bhi input le skte h
// eg: [1, 2, 3, 4, 5]

// import java.util.*;

// public class Imprtant {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Step 1: Input lo
//         String input = sc.nextLine().trim();

//         // Step 2: Bracket hatao
//         input = input.replace("[", "").replace("]", ""); // iske jagah regex bhi use kr skte h

//         input = input.replaceAll("\\[|\\]", "");
        

//         // Step 3: Split karo
//         String[] parts = input.split(",");

//         // Step 4: Array banao
//         int[] arr = new int[parts.length];

//         // Step 5: Convert + store
//         for (int i = 0; i < parts.length; i++) {
//             arr[i] = Integer.parseInt(parts[i].trim());
//         }

//         // Step 6: Sum calculate karo
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }

//         // Output
//         System.out.println("Sum = " + sum);
//     }
// }




////  now universal code jo sbhi format me input le skta h
/// 🎯 Final Result
// Input	Works?
// [1,2,3,4]	✅
// [1, 2, 3, 4]	✅
// 1 2 3 4	✅
// [1 2 3]	✅
//[-1, -2, 3]    ✅


// import java.util.*;

// public class Important {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         String input = sc.nextLine();

//         // 🔥 Sab non-numbers ko space se replace karo
//         input = input.replaceAll("[^0-9-]", " ");

//         // Extra spaces remove
//         input = input.trim();

//         // Split by space
//         String[] parts = input.split("\\s+");

//         // Convert to int
//         int[] arr = new int[parts.length];

//         for (int i = 0; i < parts.length; i++) {
//             arr[i] = Integer.parseInt(parts[i]);
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }



/// for  string sprated words 
/// apple banana orange
/// 

// import java.util.*;

// public class Important {
// //     public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);

//         String input = sc.nextLine();

//         // Split by space
//         String[] parts = input.split("\\s+");

//         System.out.println(Arrays.toString(parts));
// }}


// for  string sprated words with comma
/// apple,banana,orange
///  it will work for both comma and space separated words
//  import java.util.*;
//  public class Important {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);

//         String input = sc.nextLine();

//         // 🔥 Sab non-numbers ko space se replace karo
//         input = input.replaceAll("[^a-zA-Z]", " ");

//         // Extra spaces remove
//         input = input.trim();

//         // Split by space
//         String[] parts = input.split("\\s+");

//         System.out.println(Arrays.toString(parts));
//     }
// }


