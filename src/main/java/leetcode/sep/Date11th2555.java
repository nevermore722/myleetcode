package leetcode.sep;

public class Date11th2555 {
    public int maximizeWin(int[] prizePositions, int k) {
        int n = prizePositions.length;
        // 说明所有奖品都可以被覆盖
        if (k * 2 + 1 >= prizePositions[n - 1] - prizePositions[0]) {
            return n;
        }
        int ans = 0;
        int left1 = 0;
        int left2 = 0;
        int leftMx = 0;  // 替换原先的dp数组
        for (int right2 = 0; right2 < n; right2++) {
            // 右窗口长度超出，移动左指针
            while (prizePositions[right2] - prizePositions[left2] > k) {
                left2++;
            }
            // 更新 leftMx
            for (int right1 = left1; right1 < left2; right1++) {
                while (prizePositions[right1] - prizePositions[left1] > k) {
                    left1++;
                }
                leftMx = Math.max(leftMx, right1 - left1 + 1);
            }
            // 更新答案
            ans = Math.max(ans, right2 - left2 + 1 + leftMx);
        }
        return ans;
    }
}
