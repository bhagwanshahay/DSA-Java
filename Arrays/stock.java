public class Stock {
     static int maxProfit(int[] prices) {
        int lowestPrice = 0;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            lowestPrice = prices[i];

            if (lowestPrice > prices[i]) {
                lowestPrice = prices[i];
            } else {
                int calculate = prices[i] - lowestPrice;

               if ( calculate > maxProfit ) {
                maxProfit = calculate;
               }

            }
            
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
