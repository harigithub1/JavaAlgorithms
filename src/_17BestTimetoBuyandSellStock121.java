// LeetCode 121: Best Time to Buy and Sell Stock
// Find the maximum possible profit.
public class _17BestTimetoBuyandSellStock121 {
    // Pattern: Greedy Algorithm (One-Pass Optimization)

    /**
     * As you go through prices, you want to find the lowest price so far (the best buying day).
     *
     * On each day, you ask:
     * If I sell today, what would my profit be?
     * profit = price_today - min_price_so_far
     *
     * You always keep track of:
     *
     * The smallest price seen so far (minPrice)
     *
     * The largest profit seen so far (maxProfit)
     */

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;

        int minPrice = prices[0];   // smallest price so far (buying point)
        int maxProfit = 0;          // best profit found so far

        for (int i = 1; i < prices.length; i++) {
            // Step 1: Calculate profit if we sold today
            int todaysPrice = prices[i];
            // Step 2: Update maxProfit if this profit is higher
            int profit = todaysPrice - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            // Step 3: Update minPrice if today's price is lower
            if (todaysPrice < minPrice) {
                minPrice = todaysPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int[] i = {7,1,5,3,6,4};
        System.out.println(maxProfit(i));
    }
}