package leetcode.july;

public class Date04th343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        if (n == 2) {
            return 1;
        }
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                int max = Math.max(j * (i - 1), j * dp[i - j]);
                dp[i] = Math.max(dp[i], max);
            }
        }
        return dp[n];
    }
}
