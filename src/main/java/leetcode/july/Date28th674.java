package leetcode.july;

import java.util.Arrays;

public class Date28th674 {
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = Math.max(dp[i - 1] + 1, dp[i]);
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
