package leetcode.august;

public class Date19th552 {
    public int checkRecord(int n) {
        int mod = (int) (1e9 + 7);
        long[][][] dp = new long[n + 1][2][3];
        dp[0][0][0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i][0][0] = (dp[i - 1][0][0] + dp[i - 1][0][1] + dp[i - 1][0][2]) % mod;
            dp[i][0][1] = dp[i - 1][0][0];
            dp[i][0][2] = dp[i - 1][0][1];
            dp[i][1][0] = (dp[i - 1][0][0] + dp[i - 1][0][1] + dp[i - 1][0][2] + dp[i - 1][1][0] + dp[i - 1][1][1] + dp[i - 1][1][2]) % mod;
            dp[i][1][1] = dp[i - 1][1][0]; // 注意这里缺席只能来自于昨天，因为如果缺席了就不会迟到了
            dp[i][1][2] = dp[i - 1][1][1];
        }
        long res = (dp[n][0][0] + dp[n][0][1] + dp[n][0][2] + dp[n][1][0] + dp[n][1][1] + dp[n][1][2]) % mod;
        return (int) res;
    }


}
