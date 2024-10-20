package leetcode.oct;

public class Date19th3192 {
    public int minOperations(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && cnt % 2 == 0) cnt++;
            else if (nums[i] == 1 && cnt % 2 == 1) cnt++;
        }
        return cnt;
    }
}
