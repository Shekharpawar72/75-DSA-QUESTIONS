package String;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s){
             HashSet<Character> set = new HashSet<>();

        int left = 0; // left pointer
        int maxLength = 0; // maximum length of substring without repeating characters

        for (int right = 0; right < s.length(); right++) { // right pointer

            while (set.contains(s.charAt(right))) {  // duplicate mil gaya
                set.remove(s.charAt(left)); // left character ko remove karo
                left++; // left pointer ko aage badhao
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1); // update max length
        }

        return maxLength; // final maximum length return karo


    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
         
        
    }
}


///////////*
/*
🧠 Tumhara Logic (Correct Explanation – Interview me bolne ke liye)

“Is problem me main Sliding Window technique use karta hoon.
Main ek HashSet leta hoon jo current substring ke unique characters store karta hai.
Do pointers hote hain – left aur right.

Agar right pointer ka character set me nahi hai, to main use set me add karta hoon aur maximum length update karta hoon.

Agar character pehle se present ho, to main left pointer ko aage badhata hoon aur left character ko set se remove karta hoon jab tak duplicate remove na ho jaye.

Is tarah har character ek baar add aur remove hota hai, isliye time complexity O(n) hoti hai.”

🔥 Ye explanation interview ke liye perfect hai.

*/