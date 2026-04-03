package TcsSiftQuestions;
import java.util.Scanner;

public class inputtaking {
    public static void main (String[] args) {
     
     Scanner sc = new Scanner(System.in);
     
     int mincharge = sc.nextInt();
     
     sc.nextLine();
     
     String input= sc.nextLine();
     
     String[] ars = input.split(" ");
     int count=0;
     
     for(int i=0; i<ars.length; i++){
         int charge =Integer.parseInt(ars[i]);
        if(charge>=mincharge){
           count++;
        }
     }
     
     System.out.println(count);
   }
}







/// for comma separated input
/// 
/// 
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int mincharge = sc.nextInt();
//         sc.nextLine(); // ya padh tha String ko line ki traha
        
//         String input = sc.nextLine();

//         String[] part = input.split(",");
        
//         int count = 0;

//         for (int i = 0; i < part.length; i++) {
//             int charge = Integer.parseInt(part[i]);

//             if (charge >= mincharge) {
//                 count++;
//             }
//         }

//         System.out.println(count);
//     }
// }