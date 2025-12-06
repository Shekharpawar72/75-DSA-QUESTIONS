package Arrays;
import java.util.*;

public class GroupAnagrams {
     public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        // apne ek map banaya jisme key sorted string hogi aur value uske anagrams ki list hogi
        for (String str : strs) {
            // phir har string ko sort karenge
            char[] charArray = str.toCharArray(); // isme ky kiya apne string ko char array me convert kiya
            Arrays.sort(charArray);
            String sortedStr = new String(charArray); // sime line me apne sorted char array ko firse string me convert kiya
              

            // ab map me check karenge ki ye sorted string pehle se hai ya nahi
            // agar nahi hai to ek naya entry banayenge
            // fir us sorted string ke corresponding list me original string ko add karenge
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
             // finally apne map ki values ko return karenge jo ki grouped anagrams ki list hogi
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams(); // test karne ke liye
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"}; // input
        List<List<String>> groupedAnagrams = solution.groupAnagrams(strs); // method call
        // output
        System.out.println(groupedAnagrams);

        // Example output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
        // Note: The order of groups and the order of strings within each group may vary
    }
}
