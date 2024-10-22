package leetcode.oct;

import java.util.Arrays;

public class Date21th910 {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[n - 1] - nums[0];
        for (int i = 1; i < n; ++i) {
            int mn = Math.min(nums[0] + k, nums[i] - k);  // 最小值
            int mx = Math.max(nums[i - 1] + k, nums[n - 1] - k);  // 最大值
            ans = Math.min(ans, mx - mn);
        }
        return ans;
    }
}
