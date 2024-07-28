package leetcode.july;

public class Date23th123 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][5];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        dp[0][3] = -prices[0];
        dp[0][4] = 0;
        for (int i = 1; i < prices.length; i++) {
            // 不操作
            dp[i][0] = dp[i - 1][0];
            // 第一次持有
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
            // 第一次不持有
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            // 第二次持有
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            // 第二次不持有
            dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
        }
        return dp[prices.length - 1][4];
    }
}
