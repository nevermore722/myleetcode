package leetcode.july;

public class Date24th188 {
    public int maxProfit(int k, int[] prices) {
        int[][] dp = new int[prices.length][2 * k + 1];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        if (k > 1) {
            dp[0][3] = -prices[0];
            dp[0][4] = 0;
        }


        for (int j = 0; j < 2 * k; j++) {
            if (j % 2 == 1) {
                dp[0][j] = -prices[0];
            }
        }

        for (int i = 1; i < prices.length; i++) {
            // 不操作
            dp[i][0] = dp[i - 1][0];
            // 第一次持有
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
            // 第一次不持有
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            for (int j = 2; j < 2 * k; j++) {
                if (j % 2 == 0) {
                    // 第k次持有
                    dp[i][j + 1] = Math.max(dp[i - 1][j + 1], dp[i - 1][j] - prices[i]);
                    // 第k次不持有
                    dp[i][j + 2] = Math.max(dp[i - 1][j + 2], dp[i - 1][j + 1] + prices[i]);
                }
            }
        }
        return dp[prices.length - 1][2 * k];
    }
}
