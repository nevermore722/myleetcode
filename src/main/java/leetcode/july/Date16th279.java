package leetcode.july;

import com.alibaba.fastjson2.JSON;

public class Date16th279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= n; j++) {
                if (j * j > i) {
                    continue;
                }
                dp[i] = Math.min(dp[i - j * j] + 1, dp[i]);
            }
        }
        return dp[n];
    }
}
