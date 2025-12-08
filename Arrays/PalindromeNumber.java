package Arrays;

// leetcode problem link: https://leetcode.com/problems/palindrome-number/
// leetcode problem name: 9 Palindrome Number

public class PalindromeNumber {
    public boolean isPalindrome(int x) { 
          int temp = x;         // original number ko store karne ke liye
          int rev =0;           // reverse number ko store karne ke liye

            while(x>0){
                 int digit = x %10;              // last digit nikal rahe hain
                 rev = rev*10 + digit;           // reverse number banate ja rahe hain
                    x = x /10;                   // last digit ko remove kar rahe hain
            } 
            if(rev == temp){                     // original number aur reverse number same hain ya nahi
                return true;
            }
            return false;
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        int number = 121;
        boolean result = pn.isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result);
    }
}
