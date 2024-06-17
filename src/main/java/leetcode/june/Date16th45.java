package leetcode.june;

public class Date16th45 {
    public int jump(int[] nums) {
        int cur = 0;
        int ans = 0;
        while (cur < nums.length - 1) {
            if (nums[cur] + cur >= nums.length - 1) {
                ans++;
                return ans;
            }
            int max = 0;
            int maxIndex = 0;
            for (int i = cur + 1; i <= nums[cur] + cur && i < nums.length; i++) {
                int sum = i - cur + nums[i];
                if (max < sum) {
                    max = sum;
                    maxIndex = i;
                }
            }
            cur = maxIndex;
            ans++;
            if (nums[cur] + cur >= nums.length - 1) {
                ans++;
                return ans;
            }
        }
        return ans;
    }
}
