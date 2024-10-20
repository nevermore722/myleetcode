package leetcode.oct;

public class Date20th908 {
    public int smallestRangeI(int[] nums, int k) {
        int n = nums.length;
        int mx = Integer.MIN_VALUE;
        int mi = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            mi = Math.min(mi, nums[i]);
        }
        if (mx - k >= mi + k) return mx - k - (mi + k);
        return 0;
    }
}
