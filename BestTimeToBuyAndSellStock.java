class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int max = 0;

        for (int price : prices) {
            minimum = Math.min(minimum, price);
            max = Math.max(max, price - minimum);
        }


        return max;
    }
}