package leetcode.july;

import com.alibaba.fastjson2.JSON;

import java.util.Arrays;

public class Date10th494 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        if ((sum - target) % 2 != 0) {
            return 0;
        }
        int calcNum = sum - (sum - target) / 2;
        if (target < 0 && sum < -target) {
            return 0;
        }
        int[] dp = new int[calcNum + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = calcNum; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[calcNum];
    }
}
