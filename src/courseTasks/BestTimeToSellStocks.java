package courseTasks;

public class BestTimeToSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int min = prices[0];
        for (int price : prices) {
            if (price > min) {
                profit = Math.max(profit, price - min);
            } else {
               min = price;
            }
        }
        return profit;
    }
}
