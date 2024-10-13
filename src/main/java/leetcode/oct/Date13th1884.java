package leetcode.oct;

import java.util.Arrays;

public class Date13th1884 {
    public int twoEggDrop(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.min(dp[i], Math.max(j, dp[i - j] + 1));
            }
        }
        return dp[n];
    }
}
