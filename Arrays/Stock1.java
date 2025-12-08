// ...existing code...
package Arrays;
import java.util.*; 
         // 

         //
class Stock1 {
    public int maxProfit(int[] prices) {
        // ye wala approach O(n) time complexity me kaam karta hai
        //
        int maxprofit = 0;
        int minsofar = prices[0];

        for (int i = 0; i < prices.length; i++) {
            minsofar = Math.min(minsofar, prices[i]);
            maxprofit = Math.max(maxprofit, prices[i] - minsofar);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        Stock1 sol = new Stock1();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Input: [7,1,5,3,6,4] -> Max profit: " + sol.maxProfit(prices1));

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Input: [7,6,4,3,1] -> Max profit: " + sol.maxProfit(prices2));
    }
}
// ...existing code...