package Arrays;

public class ValidAnagram {
     public boolean isAnagram(String s, String t) {
        // Check if lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        // Count frequency of each character in both strings
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // Increment count for character in s
            count[t.charAt(i) - 'a']--; // Decrement count for character in t
            // isme -- ku ki agar dono string same hai to count array me sab 0 ho jayega
        }

        for (int c : count) {
            if (c != 0) {
                return false;   // If any count is not zero, s and t are not anagrams
            }
        }

        return true;
    }
    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Input: s = \"anagram\", t = \"nagaram\" -> Is Anagram: " + solution.isAnagram(s, t));
    }
}
