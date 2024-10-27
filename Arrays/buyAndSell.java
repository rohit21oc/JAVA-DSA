package Arrays;

public class buyAndSell {

    // Method to calculate the maximum profit from stock prices
    public static int buyandSellStocks(int prices[]) {
        // Initialize buyPrice to the maximum integer value to ensure any price will be lower
        int buyPrice = Integer.MAX_VALUE;
        
        // Initialize maxProfit to 0 as initially there's no profit
        int maxProfit = 0; 

        // Loop through each price in the array
        for (int i = 0; i < prices.length; i++) {
            
            // If current buy price is less than the current stock price
            if (buyPrice < prices[i]) {
                // Calculate the profit if sold today
                int profit = prices[i] - buyPrice;
                
                // Update maxProfit to the higher value between current maxProfit and new profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Update buyPrice to the current price since it's the lowest seen so far
                buyPrice = prices[i];
            }
        }

        // Return the maximum profit found
        return maxProfit;
    }

    public static void main(String[] args) {
        // Define an array of stock prices
        int prices[] = {7, 1, 5, 3, 6, 4};

        // Call the method and print the maximum profit
        System.out.print("Profit is: ");
        System.out.println(buyandSellStocks(prices));
    }
}
