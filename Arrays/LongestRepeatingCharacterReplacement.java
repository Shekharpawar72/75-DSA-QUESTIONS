package Arrays;

public class LongestRepeatingCharacterReplacement {
      public int characterReplacement(String s, int k) {
        int [] count = new int [26];
        int left =0;
        int maxcount = 0;
        int result =0;

        for(int right =0; right<s.length(); right++){
            //   int idxR= s.cahrAt(right)-'A';
            int idxR = s.charAt(right) - 'A';
              count[idxR]++;
            //   maxcount = Math.max(maxcount , count[inxR]);
                maxcount = Math.max(maxcount, count[idxR]);

              while((right-left+1)-maxcount >k){
                  int idxL = s.charAt(left)-'A';
                  count[idxL]--;
                  left++;
              }
              result = Math.max(result , right-left+1);
        }
        return result;
    }
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        String s = "AABABBA";
        int k = 1;
        System.out.println("Input: s = \"AABABBA\", k = 1 -> Length of Longest Repeating Character Replacement: " + solution.characterReplacement(s, k));
    }
}


// 













