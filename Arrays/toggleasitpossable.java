package Arrays;

import java.util.Scanner;

public class toggleasitpossable {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

        //  String str = Integer.toBinaryString(n);

        //  /// 0 - t 
        
        //  ///  1 - 0
        //  /// t - 1
        
        // str = str.replace('0', 't');
        // str= str.replace('1', '0');
        // str = str.replace('t', '1');
       
        // int result  = Integer.parseInt(str, 2); 
        // // ism pareseInt ka use karte hai to hume ye batana padta hai ki ye string kis base me hai, kyuki binary string ko decimal me convert karna hota hai, isliye hum 2 pass karte hai.
        // // ku use kiya yaha pr t character ko, kyuki jab hum 0 ko 1 me convert karte hai to 0 ko 1 me convert karne ke baad 1 ko 0 me convert karna hota hai, isliye hum t character ka use karte hai, taki hum 0 ko 1 me convert karne ke baad t character ka use karke 1 ko 0 me convert kar sake.
        // System.out.println(result);

        int bits = Integer.toBinaryString(n).length();
int mask = (1 << bits) - 1;
System.out.println(n ^ mask);
    }
}
