package leetcode.july;

import java.util.Arrays;

public class Date31th53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > dp[i - 1] && dp[i - 1] < 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i - 1] + nums[i];
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
