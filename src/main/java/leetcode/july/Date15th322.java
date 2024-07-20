package leetcode.july;

public class Date15th322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                int coin = coins[j];
                if (i >= coin && dp[i - coin] != Integer.MAX_VALUE) {
                    min = Math.min(min, dp[i - coin] + 1);
                }
            }
            dp[i] = min;
        }

        if (dp[amount] == Integer.MAX_VALUE) {
            dp[amount] = -1;
        }
        return dp[amount];

    }
}
