package leetcode.oct;

import java.util.Arrays;

public class Date25th3180 {
    public int maxTotalReward(int[] rewardValues) {
        Arrays.sort(rewardValues);
        int m = rewardValues[rewardValues.length - 1];
        int[] dp = new int[2 * m];
        dp[0] = 1;
        for (int x : rewardValues) {
            for (int k = 2 * x - 1; k >= x; --k) {
                dp[k] |= dp[k - x];
            }
        }
        for (int i = dp.length - 1; i >= 0; --i) {
            if (dp[i] == 1) {
                return i;
            }
        }
        return 0;
    }
}
