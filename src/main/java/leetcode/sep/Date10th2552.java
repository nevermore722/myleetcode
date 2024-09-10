package leetcode.sep;

import java.util.Arrays;

public class Date10th2552 {
    public long countQuadruplets(int[] nums) {
        int n = nums.length;

        // big[i][j]表示nums[i]后面，大于j的数个数
        int[][] big = new int[n][n + 1];
        int[][] small = new int[n][n + 1];
        for (int i = n - 2; i > 0; i--) {
            big[i] = Arrays.copyOfRange(big[i + 1], 0, n + 1);
            for (int x = nums[i + 1] - 1; x >= 0; x--) {
                big[i][x]++; // 比nums[i+1]小的数都加1
            }
        }
        for (int i = 1; i < n; i++) {
            small[i] = Arrays.copyOfRange(small[i - 1], 0, n + 1);
            for (int x = nums[i - 1] + 1; x <= n; x++) {
                small[i][x]++;
            }
        }

        long res = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (nums[i] > nums[j]) {
                    int right = big[j][nums[i]];
                    //int left = small[i][nums[j]];
                    // i-->n-1下标对应的数中，小于nums[j]的个数
                    int smallThenNumsJCnt = n - i - big[i][nums[j]] - 1;
                    // 0-->i-1下标对应的数中, 小于nums[j]的个数等于总数nums[j]
                    int left = nums[j] - smallThenNumsJCnt;

                    res += left * right;
                }
            }
        }
        return res;
    }
}
