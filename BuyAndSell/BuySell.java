package BuyAndSell;

public class BuySell {
    public static int buynSell(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] = prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = buynSell(prices);
        System.out.println(maxProfit);
    }
}
