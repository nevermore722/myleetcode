package leetcode.june;

public class Date13th53 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], max = nums[0];
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (sum < 0) {
                //  如果 sum 小于 0，说明他对于下一个 sum 起副作用，所以将 sum 重置为当前元素
                sum = nums[i];
            } else {
                //  否则的话，直接将当前元素累加到 sum 上
                sum += nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
