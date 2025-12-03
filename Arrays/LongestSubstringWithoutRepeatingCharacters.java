package Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        boolean[] seen = new boolean[128]; // ASCII character set

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            while (seen[currentChar]) {
                seen[s.charAt(left)] = false;
                left++;
            }
            seen[currentChar] = true;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        System.out.println("Input: s = \"abcabcbb\" -> Length of Longest Substring Without Repeating Characters: " + solution.lengthOfLongestSubstring(s));
    }
}
