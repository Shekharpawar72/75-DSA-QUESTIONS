import java.util.*;

public class Plue {
     public int[] plusOne(int[] digits) {
        
        for( int i=digits.length -1; i>=0; i--){
            if(digits[i] < 9){
                 digits[i]++;
                 return digits;
            }
            digits[i]=0; // digit was 9 so make it 0 
        }
         int[] result = new int[digits.length + 1];
    result[0] = 1; // e.g. 999 → 1000
    return result;
    }
    public static void main(String[] args) {
            
        Plue obj = new Plue();
        int[] digits = {9,9,9};
        int[] result = obj.plusOne(digits);
        for(int digit : result){
            System.out.print(digit + " ");
        }       


    }
}
