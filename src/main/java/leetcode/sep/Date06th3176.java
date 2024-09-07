package leetcode.sep;

import java.util.Arrays;

public class Date06th3176 {
    public int maximumLength(int[] nums, int k) {
        //dp[i][j]当前nums[i]重复的不超过J的好序列的最大个数
        int maximumLength = 1;
        int n = nums.length;
        int[][] dp = new int[n][k + 1];
        //因为还有K=0的情况
        Arrays.fill(dp[0], 1);
        for (int i = 0; i < n; i++) {
            int premax = 0;
            for (int j = 0; j <= k; j++) {
                for (int p = 0; p < i; p++)//从0到i-1且重复为j的最大长度
                {
                    if (nums[p] == nums[i]) {
                        premax = Math.max(dp[p][j], premax);
                    }
                    if (nums[p] != nums[i] && j > 0) {
                        premax = Math.max(dp[p][j - 1], premax);
                    }
                }
                dp[i][j] = premax + 1;
            }
            //因为每一个i不超过k个重复值的串都可以是最大
            maximumLength = Math.max(dp[i][k], maximumLength);
        }
        return maximumLength;
    }
}
